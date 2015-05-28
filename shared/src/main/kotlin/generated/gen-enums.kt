package html4k

import html4k.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

enum public class Dir(override val realValue : String) : AttributeEnum {
    ltr("ltr"),
    rtl("rtl")
}

private val dirValues : Map<String, Dir> = Dir.values().toMap { it.realValue }
enum public class Draggable(override val realValue : String) : AttributeEnum {
    true_("true"),
    false_("false"),
    auto("auto")
}

private val draggableValues : Map<String, Draggable> = Draggable.values().toMap { it.realValue }
enum public class RunAt(override val realValue : String) : AttributeEnum {
    server("server")
}

private val runAtValues : Map<String, RunAt> = RunAt.values().toMap { it.realValue }
public object ATarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

public object ARel {
    val alternate : String = "Alternate"
    val appEndIx : String = "Appendix"
    val bookmark : String = "Bookmark"
    val chapter : String = "Chapter"
    val contentS : String = "Contents"
    val copyright : String = "Copyright"
    val glossary : String = "Glossary"
    val help : String = "Help"
    val index : String = "Index"
    val next : String = "Next"
    val prev : String = "Prev"
    val section : String = "Section"
    val start : String = "Start"
    val stylesheet : String = "Stylesheet"
    val subsection : String = "Subsection"

    val values : List<String> = listOf("alternate", "appEndIx", "bookmark", "chapter", "contentS", "copyright", "glossary", "help", "index", "next", "prev", "section", "start", "stylesheet", "subsection")
}

public object AType {
    val textAsp : String = "text/asp"
    val textAsa : String = "text/asa"
    val textCss : String = "text/css"
    val textHtml : String = "text/html"
    val textJavaScript : String = "text/javascript"
    val textPlain : String = "text/plain"
    val textScriptLet : String = "text/scriptlet"
    val textXComponent : String = "text/x-component"
    val textXHtmlInsertion : String = "text/x-html-insertion"
    val textXml : String = "text/xml"

    val values : List<String> = listOf("textAsp", "textAsa", "textCss", "textHtml", "textJavaScript", "textPlain", "textScriptLet", "textXComponent", "textXHtmlInsertion", "textXml")
}

enum public class AreaShape(override val realValue : String) : AttributeEnum {
    rect("rect"),
    circle("circle"),
    poly("poly"),
    default("default")
}

private val areaShapeValues : Map<String, AreaShape> = AreaShape.values().toMap { it.realValue }
public object AreaTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

public object AreaRel {
    val alternate : String = "Alternate"
    val appEndIx : String = "Appendix"
    val bookmark : String = "Bookmark"
    val chapter : String = "Chapter"
    val contentS : String = "Contents"
    val copyright : String = "Copyright"
    val glossary : String = "Glossary"
    val help : String = "Help"
    val index : String = "Index"
    val next : String = "Next"
    val prev : String = "Prev"
    val section : String = "Section"
    val start : String = "Start"
    val stylesheet : String = "Stylesheet"
    val subsection : String = "Subsection"

    val values : List<String> = listOf("alternate", "appEndIx", "bookmark", "chapter", "contentS", "copyright", "glossary", "help", "index", "next", "prev", "section", "start", "stylesheet", "subsection")
}

public object BaseTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

enum public class ButtonFormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData("multipart/form-data"),
    applicationXWwwFormUrlEncoded("application/x-www-form-urlencoded"),
    textPlain("text/plain")
}

private val buttonFormEncTypeValues : Map<String, ButtonFormEncType> = ButtonFormEncType.values().toMap { it.realValue }
enum public class ButtonFormMethod(override val realValue : String) : AttributeEnum {
    get("get"),
    post("post"),
    put("put"),
    delete("delete")
}

private val buttonFormMethodValues : Map<String, ButtonFormMethod> = ButtonFormMethod.values().toMap { it.realValue }
public object ButtonFormTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

enum public class ButtonType(override val realValue : String) : AttributeEnum {
    button("button"),
    reset("reset"),
    submit("submit")
}

private val buttonTypeValues : Map<String, ButtonType> = ButtonType.values().toMap { it.realValue }
enum public class CommandType(override val realValue : String) : AttributeEnum {
    command("command"),
    checkBox("checkbox"),
    radio("radio")
}

private val commandTypeValues : Map<String, CommandType> = CommandType.values().toMap { it.realValue }
enum public class FormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData("multipart/form-data"),
    applicationXWwwFormUrlEncoded("application/x-www-form-urlencoded"),
    textPlain("text/plain")
}

private val formEncTypeValues : Map<String, FormEncType> = FormEncType.values().toMap { it.realValue }
enum public class FormMethod(override val realValue : String) : AttributeEnum {
    get("get"),
    post("post"),
    put("put"),
    delete("delete")
}

private val formMethodValues : Map<String, FormMethod> = FormMethod.values().toMap { it.realValue }
public object FormTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

public object IframeName {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

enum public class IframeSandbox(override val realValue : String) : AttributeEnum {
    allowSameOrigin("allow-same-origin"),
    allowFormS("allow-forms"),
    allowScripts("allow-scripts")
}

private val iframeSandboxValues : Map<String, IframeSandbox> = IframeSandbox.values().toMap { it.realValue }
enum public class InputType(override val realValue : String) : AttributeEnum {
    button("button"),
    checkBox("checkbox"),
    color("color"),
    date("date"),
    dateTime("datetime"),
    dateTimeLocal("datetime-local"),
    email("email"),
    file("file"),
    hidden("hidden"),
    image("image"),
    month("month"),
    number("number"),
    password("password"),
    radio("radio"),
    range("range"),
    reset("reset"),
    search("search"),
    submit("submit"),
    text("text"),
    tel("tel"),
    time("time"),
    url("url"),
    week("week")
}

private val inputTypeValues : Map<String, InputType> = InputType.values().toMap { it.realValue }
enum public class InputFormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData("multipart/form-data"),
    applicationXWwwFormUrlEncoded("application/x-www-form-urlencoded"),
    textPlain("text/plain")
}

private val inputFormEncTypeValues : Map<String, InputFormEncType> = InputFormEncType.values().toMap { it.realValue }
enum public class InputFormMethod(override val realValue : String) : AttributeEnum {
    get("get"),
    post("post"),
    put("put"),
    delete("delete")
}

private val inputFormMethodValues : Map<String, InputFormMethod> = InputFormMethod.values().toMap { it.realValue }
public object InputFormTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

enum public class KeyGenKeyType(override val realValue : String) : AttributeEnum {
    rsa("rsa")
}

private val keyGenKeyTypeValues : Map<String, KeyGenKeyType> = KeyGenKeyType.values().toMap { it.realValue }
public object LinkRel {
    val alternate : String = "Alternate"
    val appEndIx : String = "Appendix"
    val bookmark : String = "Bookmark"
    val chapter : String = "Chapter"
    val contentS : String = "Contents"
    val copyright : String = "Copyright"
    val glossary : String = "Glossary"
    val help : String = "Help"
    val index : String = "Index"
    val next : String = "Next"
    val prev : String = "Prev"
    val section : String = "Section"
    val start : String = "Start"
    val stylesheet : String = "Stylesheet"
    val subsection : String = "Subsection"

    val values : List<String> = listOf("alternate", "appEndIx", "bookmark", "chapter", "contentS", "copyright", "glossary", "help", "index", "next", "prev", "section", "start", "stylesheet", "subsection")
}

public object LinkMedia {
    val screen : String = "screen"
    val print : String = "print"
    val tty : String = "tty"
    val tv : String = "tv"
    val projection : String = "projection"
    val handheld : String = "handheld"
    val braille : String = "braille"
    val aural : String = "aural"
    val all : String = "all"

    val values : List<String> = listOf("screen", "print", "tty", "tv", "projection", "handheld", "braille", "aural", "all")
}

public object LinkType {
    val textAsp : String = "text/asp"
    val textAsa : String = "text/asa"
    val textCss : String = "text/css"
    val textHtml : String = "text/html"
    val textJavaScript : String = "text/javascript"
    val textPlain : String = "text/plain"
    val textScriptLet : String = "text/scriptlet"
    val textXComponent : String = "text/x-component"
    val textXHtmlInsertion : String = "text/x-html-insertion"
    val textXml : String = "text/xml"

    val values : List<String> = listOf("textAsp", "textAsa", "textCss", "textHtml", "textJavaScript", "textPlain", "textScriptLet", "textXComponent", "textXHtmlInsertion", "textXml")
}

enum public class MenuType(override val realValue : String) : AttributeEnum {
    context("context"),
    toolbar("toolbar"),
    list("list")
}

private val menuTypeValues : Map<String, MenuType> = MenuType.values().toMap { it.realValue }
public object MetaHttpEquiv {
    val contentLanguage : String = "content-language"
    val contentType : String = "content-type"
    val defaultStyle : String = "default-style"
    val refresh : String = "refresh"

    val values : List<String> = listOf("contentLanguage", "contentType", "defaultStyle", "refresh")
}

public object ObjectName {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"

    val values : List<String> = listOf("blank", "parent", "self", "top")
}

enum public class ScriptType(override val realValue : String) : AttributeEnum {
    textEcmaScript("text/ecmascript"),
    textJavaScript("text/javascript"),
    textJavaScript10("text/javascript1.0"),
    textJavaScript11("text/javascript1.1"),
    textJavaScript12("text/javascript1.2"),
    textJavaScript13("text/javascript1.3"),
    textJavaScript14("text/javascript1.4"),
    textJavaScript15("text/javascript1.5"),
    textJScript("text/jscript"),
    textXJavaScript("text/x-javascript"),
    textXEcmaScript("text/x-ecmascript"),
    textVbScript("text/vbscript")
}

private val scriptTypeValues : Map<String, ScriptType> = ScriptType.values().toMap { it.realValue }
public object StyleType {
    val textCss : String = "text/css"

    val values : List<String> = listOf("textCss")
}

public object StyleMedia {
    val screen : String = "screen"
    val print : String = "print"
    val tty : String = "tty"
    val tv : String = "tv"
    val projection : String = "projection"
    val handheld : String = "handheld"
    val braille : String = "braille"
    val aural : String = "aural"
    val all : String = "all"

    val values : List<String> = listOf("screen", "print", "tty", "tv", "projection", "handheld", "braille", "aural", "all")
}

enum public class TextAreaWrap(override val realValue : String) : AttributeEnum {
    hard("hard"),
    soft("soft")
}

private val textAreaWrapValues : Map<String, TextAreaWrap> = TextAreaWrap.values().toMap { it.realValue }
enum public class ThScope(override val realValue : String) : AttributeEnum {
    col("col"),
    colGroup("colgroup"),
    row("row"),
    rowGroup("rowgroup")
}

private val thScopeValues : Map<String, ThScope> = ThScope.values().toMap { it.realValue }
