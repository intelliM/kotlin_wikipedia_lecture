package com.company.kotlin_wikipedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val unencodedHtml: String = """
            <table
              cellpadding="2"
              class="morfotable ru"
              rules="all"
              style="
                float: right;
                clear: right;
                padding: 3;
                margin-left: 0.5em;
                margin-bottom: 0.5em;
                border: 1px solid #6699cc;
                border-collapse: collapse;
              "
            >
              <tbody>
                <tr>
                  <th bgcolor="#EEF9FF"></th>
                  <th bgcolor="#EEF9FF">
                    <a
                      href="/wiki/%D0%B1%D1%83%D0%B4%D1%83%D1%89%D0%B5%D0%B5_%D0%B2%D1%80%D0%B5%D0%BC%D1%8F"
                      title="будущее время"
                      >будущ.</a
                    >
                  </th>
                  <th bgcolor="#EEF9FF">
                    <a
                      href="/wiki/%D0%BF%D1%80%D0%BE%D1%88%D0%B5%D0%B4%D1%88%D0%B5%D0%B5_%D0%B2%D1%80%D0%B5%D0%BC%D1%8F"
                      title="прошедшее время"
                      >прош.</a
                    >
                  </th>
                  <th bgcolor="#EEF9FF">
                    <a
                      href="/wiki/%D0%BF%D0%BE%D0%B2%D0%B5%D0%BB%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D0%B5_%D0%BD%D0%B0%D0%BA%D0%BB%D0%BE%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5"
                      title="повелительное наклонение"
                      >повелит.</a
                    >
                  </th>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a href="/wiki/%D1%8F" title="я">Я</a>
                  </td>
                  <td align="left" bgcolor="#ffffff">окажу́сь</td>
                  <td align="left" bgcolor="#ffffff">оказа́лся<br />оказа́лась</td>
                  <td align="left" bgcolor="#ffffff">—</td>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a href="/wiki/%D1%82%D1%8B" title="ты">Ты</a>
                  </td>
                  <td align="left" bgcolor="#ffffff">ока́жешься</td>
                  <td align="left" bgcolor="#ffffff">оказа́лся<br />оказа́лась</td>
                  <td align="left" bgcolor="#ffffff">окажи́сь</td>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a href="/wiki/%D0%BE%D0%BD" title="он">Он</a><br /><a
                      href="/wiki/%D0%BE%D0%BD%D0%B0"
                      title="она"
                      >Она</a
                    ><br /><a href="/wiki/%D0%BE%D0%BD%D0%BE" title="оно">Оно</a>
                  </td>
                  <td align="left" bgcolor="#ffffff">ока́жется</td>
                  <td align="left" bgcolor="#ffffff">
                    оказа́лся<br />оказа́лась<br />оказа́лось
                  </td>
                  <td align="left" bgcolor="#ffffff">—</td>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a href="/wiki/%D0%BC%D1%8B" title="мы">Мы</a>
                  </td>
                  <td align="left" bgcolor="#ffffff">ока́жемся</td>
                  <td align="left" bgcolor="#ffffff">оказа́лись</td>
                  <td align="left" bgcolor="#ffffff">ока́жемся <br />ока́жемтесь</td>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a href="/wiki/%D0%B2%D1%8B" title="вы">Вы</a>
                  </td>
                  <td align="left" bgcolor="#ffffff">ока́жетесь</td>
                  <td align="left" bgcolor="#ffffff">оказа́лись</td>
                  <td align="left" bgcolor="#ffffff">окажи́тесь</td>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a href="/wiki/%D0%BE%D0%BD%D0%B8" title="они">Они</a>
                  </td>
                  <td align="left" bgcolor="#ffffff">ока́жутся</td>
                  <td align="left" bgcolor="#ffffff">оказа́лись</td>
                  <td align="left" bgcolor="#ffffff">—</td>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a
                      href="/wiki/%D0%B4%D0%B5%D0%B9%D1%81%D1%82%D0%B2%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%B8%D1%87%D0%B0%D1%81%D1%82%D0%B8%D0%B5"
                      title="действительное причастие"
                      >Пр. действ.</a
                    >
                    <a
                      href="/wiki/%D0%BF%D1%80%D0%B8%D1%87%D0%B0%D1%81%D1%82%D0%B8%D0%B5_%D0%BF%D1%80%D0%BE%D1%88%D0%B5%D0%B4%D1%88%D0%B5%D0%B3%D0%BE_%D0%B2%D1%80%D0%B5%D0%BC%D0%B5%D0%BD%D0%B8"
                      title="причастие прошедшего времени"
                      >прош.</a
                    >
                  </td>
                  <td align="center" bgcolor="#ffffff" colspan="3">
                    <a
                      href="/wiki/%D0%BE%D0%BA%D0%B0%D0%B7%D0%B0%D0%B2%D1%88%D0%B8%D0%B9%D1%81%D1%8F"
                      title="оказавшийся"
                      >оказа́вшийся</a
                    >
                  </td>
                </tr>
                <tr>
                  <td align="right" bgcolor="#EEF9FF">
                    <a
                      href="/wiki/%D0%B4%D0%B5%D0%B5%D0%BF%D1%80%D0%B8%D1%87%D0%B0%D1%81%D1%82%D0%B8%D0%B5"
                      title="деепричастие"
                      >Деепр.</a
                    >
                    <a
                      href="/wiki/%D0%BF%D1%80%D0%BE%D1%88%D0%B5%D0%B4%D1%88%D0%B5%D0%B5_%D0%B2%D1%80%D0%B5%D0%BC%D1%8F"
                      title="прошедшее время"
                      >прош.</a
                    >
                  </td>
                  <td align="center" bgcolor="#ffffff" colspan="3">
                    <a
                      href="/wiki/%D0%BE%D0%BA%D0%B0%D0%B7%D0%B0%D0%B2%D1%88%D0%B8%D1%81%D1%8C"
                      title="оказавшись"
                      >оказа́вшись</a
                    >
                  </td>
                </tr>
              </tbody>
            </table>
        """.trimIndent()

        val encodedHtml = Base64.encodeToString(unencodedHtml.toByteArray(), Base64.NO_PADDING)
//        webview.loadUrl("file:///android_asset/test.html")
        webview.loadData(encodedHtml, "text/html", "base64")
    }
}