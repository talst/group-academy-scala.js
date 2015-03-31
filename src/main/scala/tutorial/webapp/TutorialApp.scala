package tutorial.webapp

import org.scalajs.jquery.jQuery

import scala.scalajs.js
import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.window

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
    jQuery("body").append("""<div id="content"> </div>""")
    val button = createButton
    button.setText("Press Me!")
    button.attachPress(() => window.alert("Pressed!"))
    button.placeAt("content")
  }

  def createButton = {
    js.Dynamic.newInstance(js.Dynamic.global.sap.m.Button)()
  }

}

