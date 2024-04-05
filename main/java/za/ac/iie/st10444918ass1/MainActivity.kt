package za.ac.iie.st10444918ass1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Declarations */

        val generateButton = findViewById<Button>(R.id.GENERATE)
        val ClearButton = findViewById<Button>(R.id.CLEAR)
        val NumTextNumber = findViewById<EditText>(R.id.Numedittext)
        val ResultTextView = findViewById<TextView>(R.id.Results)
        generateButton.setOnClickListener {

            /* if else statement */
            val age = NumTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                ResultTextView.text = "Please enter a valid age"


            } else {

                if (age < 15 || age > 100) {
                    ResultTextView.text = "please enter a valid age between 15 to 100"
                    NumTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        69 -> "Queen Elizabeth I was the last monarch of the Tudor dynasty, which ruled England between 1485 and 1603. The daughter of Henry VIII and Anne Boleyn, Elizabeth became Queen in 1558 aged 25, at a time of political crisis. The 'Virgin Queen' never married, but instead pledged her body to England itself."
                        52 -> "William Shakespeare was a renowned English poet, playwright, and actor born in 1564 in Stratford-upon-Avon. His birthday is most commonly celebrated on 23 April (see When was Shakespeare born), which is also believed to be the date he died in 1616."
                        36 -> "Marilyn Monroe was an American actress, comedienne, singer, and model. She became one of the world's most enduring iconic figures and is remembered both for her winsome embodiment of the Hollywood sex symbol and her tragic personal and professional struggles within the film industry."
                        29 -> "Anne's protection helped the Protestants further their cause. Henry crowned her queen on June 1, 1533. As a result of his marriage problems, Henry and his Parliament passed the Act of Supremacy in 1534, which proclaimed the king as head of the Church of England"
                        32 -> "Alexander the Great was one of the greatest military strategists and leaders in world history. He was also ruthless, dictatorial, and ambitious to the point of regarding himself as divine. His conquests of the Mediterranean states, the Persian empire, and parts of India spread Hellenistic culture across these regions."
                        67 -> "Leonardo Da Vinci is Most famous for his paintings such as the Mona Lisa and the Last Supper, Leonardo is also renowned in the fields of civil engineering, chemistry, geology, geometry, hydrodynamics, mathematics, mechanical engineering, optics, physics, pyrotechnics, and zoology.raphy."
                        76 -> "Einstein is best known for his theory of general relativity, which he first published in 1915. At the time, though, the theory was controversial, both for political reasons and because of its upending of Newtonian gravitational theory."
                        16 -> "Anne Frank was a German girl and Jewish victim of the Holocaust who is famous for keeping a diary of her experiences. Anne and her family went into hiding for two years to avoid Nazi persecution. Her documentation of this time is now published in The Diary of a Young Girl."
                        81 -> "Queen Victoria is associated with Britain's great age of industrial expansion, economic progress and, especially, empire. At her death, it was said, Britain had a worldwide empire on which the sun never set. Victoria was born at Kensington Palace, London, on 24 May 1819."
                        87 -> "Most famous for her personal triumph over the limitations of both blindness and deafness, Helen Keller was one of the twentieth century's leading advocates for individuals with disabilities."


                        else -> "No one Died at this age, try a different one!"

                    }
                    ResultTextView.text = result

                }

            }
            ClearButton.setOnClickListener {
                NumTextNumber.text.clear()
                ResultTextView.text = ""
            }

        }

    }

}



