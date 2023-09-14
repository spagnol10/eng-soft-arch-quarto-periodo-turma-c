<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;


class CalculadoraController extends Controller
{
    // public function index()
    // {
    //     return view('calculadoraView', []);
    // }

    //faça função de calculadora
    public function index(Request $request)
    {
        $num1 = $request->input('num1');
        $num2 = $request->input('num2');
        $operacao = $request->input('operacao');
        $resultado = 0;

        switch ($operacao) {
            case 'soma':
                $resultado = $num1 + $num2;
                break;
            case 'subtracao':
                $resultado = $num1 - $num2;
                break;
            case 'multiplicacao':
                $resultado = $num1 * $num2;
                break;
            case 'divisao':
                $resultado = $num1 / $num2;
                break;
        }

        $ultimoResultado = $resultado;

        //Registro do último resultado no banco de dados
        $calculadora = DB::table('calculadora_mvc')
            ->where('id', 1)
            ->first();

        $calculadora->ultimo_resultado = $ultimoResultado;
        $calculadora->save();


        return view('calculadoraView', ['resultado' => $resultado, 'ultimoResultado' => $calculadora]);
    }

}
