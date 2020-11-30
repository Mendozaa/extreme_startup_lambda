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
}
