import { Image,Text,View,StyleSheet, Button } from "react-native";
import { TextInput } from "react-native";
import { useState } from "react";
import React from "react";


export default function App(){
  
  const [peso,setPeso] = useState('')
  function QtddAgua(){
    
    let valorFinal = peso*0.035
    alert('Você deve beber '+ valorFinal.toFixed(2) +' Litros de água ao dia')

  }

  return(
    <View style={estilos.conteudo}>
      <View style={estilos.caixinha}>

        <Text style={estilos.Texto}>
          Descubra quantos litros de água você precisa beber diariamente:
        </Text>
        
        <Image
          style={estilos.Imagem}
          source={require('./images/garrafa3.png')}
        />
        
        
        <Text style={estilos.Texto2}>
          Digite seu peso:
        </Text>

        <TextInput style={estilos.input}
          keyboardType='numeric'
          value={peso}
          onChangeText={setPeso}
          placeholder="(Kg)"
        />
        
        <Button
          title="Calcular água (Litros)"
          onPress={QtddAgua}
        />
        
      </View>
    </View>
    )
  }  
  const estilos = StyleSheet.create({
      conteudo:{
        flex:1,
        backgroundColor: 'darkcyan',
        justifyContent:'center',
        alignItems:'center',
      },
      caixinha:{
        width:300,
        height:450,
        padding:20,
        borderRadius:20,
        gap: 8,
      },
      Texto:{
        fontSize: 20,
        fontFamily: 'Cochin',
        alignItems: 'center',
        justifyContent: 'center'
      },
      
      Texto2:{
        fontSize:18,
        marginTop: 10,
        fontFamily: 'Cochin',
      },
      
    Imagem: {
        marginTop:10,
        height:200,
        resizeMode:'contain',
      },
      
      input:{
        borderWidth:1,
        borderColor:'black',
        height:30,
        paddingHorizontal:7,
        borderRadius: 5,
        placeholderTextColor: "9f9fa3", 
        backgroundColor:'white',
      }
    })
