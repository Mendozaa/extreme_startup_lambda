package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {
    ResponderModel responderModel = new ResponderModel();
    @Test
    public void cuandoNoExistePreguntaRetornaDevco(){
        //Arrange
        String question="";
        //Act
        String response = responderModel.answer(question);
        //Assert
        assertThat(response).isEqualTo("devco");

    }

    @Test
    public void cuandoPreguntanPorSumar10y5yretorna15(){
        //Arrange
            String question="1234: what is the sum of 10 and 5";
        //Act
            String response=responderModel.answer(question);
        //Assert
            assertThat(response).isEqualTo("15");
    }
    @Test
    public void cuandoPreguntanSumar6y6yretorna12(){
        //Arrange
        String question="1234: what is 6 plus 6";
        //Act
        String response=responderModel.answer(question);
        //Assert
        assertThat(response).isEqualTo("12");
    }
    @Test
    public void cuandoPreguntanValoresMayores(){
        //Arrange
        String question="1234: which of the following numbers is both a square and a cube: 100, 939, 1849, 100";
        //Act
        String response=responderModel.answer(question);
        //Assert
        assertThat(response).isEqualTo("1849");
    }
    @Test
    public void cuandoPreguntanValoresMayores2(){
        //Arrange
        String question="1234: which of the following numbers is the largest: 66, 792, 402, 43";
        //Act
        String response=responderModel.answer(question);
        //Assert
        assertThat(response).isEqualTo("792");
    }
}
