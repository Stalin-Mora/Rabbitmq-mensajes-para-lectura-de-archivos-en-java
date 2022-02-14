/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabbit;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha512 {
  
 
  /**
   * Contenido de texto entrante, retorno a la cadena SHA-256
   * 
   * @param strText
   * @return
   */
  public String SHA256(final String strText)
  {
    return SHA(strText, "SHA-256");
  }
 
  /**
       * Contenido de texto entrante, volver a la cadena SHA-512
   * 
   * @param strText
   * @return
   */
  public static String SHA512(final String strText)
  {
    return SHA(strText, "SHA-512");
  }
 
  /**
       * Cadena sha cifrado
   * 
   * @param strSourceText
   * @return
   */
  private static String SHA(final String strText, final String strType)
  {
         // valor de devolución
    String strResult = null;
 
         ///Si es una cadena válida
    if (strText != null && strText.length() > 0)
    {
      try
      {
                 // cifrado sha
                 // Crear un objeto encriptado e incorporar el tipo de cifrado
        MessageDigest messageDigest = MessageDigest.getInstance(strType);
                 //Entrando la cadena a encriptada
        messageDigest.update(strText.getBytes());
                 // obtener el resultado del tipo de byte
        byte byteBuffer[] = messageDigest.digest();
 
                 // convertir byte a cadena
        StringBuffer strHexString = new StringBuffer();
                 // Transverso byte buffer
        for (int i = 0; i < byteBuffer.length; i++)
        {
          String hex = Integer.toHexString(0xff & byteBuffer[i]);
          if (hex.length() == 1)
          {
            strHexString.append('0');
          }
          strHexString.append(hex);
        }
                 // obtener el resultado de retorno
        strResult = strHexString.toString();
      }
      catch (NoSuchAlgorithmException e)
      {
        e.printStackTrace();
      }
    }
 
    return strResult;
  }

}
