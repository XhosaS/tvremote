package defpackage;

import android.graphics.Matrix;
import android.support.v7.appcompat.R;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaa extends DefaultHandler2 {
    private int d;
    private hzg a = null;
    private hyl b = null;
    private boolean c = false;
    private boolean e = false;
    private hzy f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    private static final void A(hyn hynVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                hynVar.o = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    hynVar.p = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(strTrim)));
                    }
                    hynVar.p = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    private static final void B(hyb hybVar, Attributes attributes, String str) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (hzx.a(attributes.getLocalName(i)) == hzx.points) {
                hzz hzzVar = new hzz(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                hzzVar.k();
                while (!hzzVar.n()) {
                    float fB = hzzVar.b();
                    if (Float.isNaN(fB)) {
                        throw new SAXException(a.cg(str, "Invalid <", "> points attribute. Non-coordinate content found in list."));
                    }
                    hzzVar.p();
                    float fB2 = hzzVar.b();
                    if (Float.isNaN(fB2)) {
                        throw new SAXException(a.cg(str, "Invalid <", "> points attribute. There should be an even number of coordinates."));
                    }
                    hzzVar.p();
                    arrayList.add(Float.valueOf(fB));
                    arrayList.add(Float.valueOf(fB2));
                }
                hybVar.a = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    hybVar.a[i3] = ((Float) arrayList.get(i2)).floatValue();
                    i2++;
                    i3++;
                }
            }
        }
    }

    private static final void C(hyn hynVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = hzx.a(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    ArrayList arrayList = null;
                    hzz hzzVar = new hzz(strTrim, null);
                    while (!hzzVar.n()) {
                        String strR = hzzVar.r();
                        if (strR == null) {
                            throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(strTrim)));
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(strR);
                        hzzVar.k();
                    }
                    hynVar.s = arrayList;
                } else if (iOrdinal != 72) {
                    if (hynVar.q == null) {
                        hynVar.q = new hyg();
                    }
                    c(hynVar.q, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    hzz hzzVar2 = new hzz(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strJ = hzzVar2.j(':');
                        hzzVar2.k();
                        if (hzzVar2.l(':')) {
                            hzzVar2.k();
                            String strJ2 = hzzVar2.j(';');
                            if (strJ2 != null) {
                                hzzVar2.k();
                                if (hzzVar2.n() || hzzVar2.l(';')) {
                                    if (hynVar.r == null) {
                                        hynVar.r = new hyg();
                                    }
                                    c(hynVar.r, strJ, strJ2);
                                    hzzVar2.k();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static final void D(hzc hzcVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = hzx.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                hzcVar.d = n(strTrim);
            } else if (iOrdinal == 10) {
                hzcVar.e = n(strTrim);
            } else if (iOrdinal == 82) {
                hzcVar.b = n(strTrim);
            } else if (iOrdinal == 83) {
                hzcVar.c = n(strTrim);
            }
        }
    }

    private static final void E(hyt hytVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = hzx.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                w(hytVar, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                hzz hzzVar = new hzz(strTrim);
                hzzVar.k();
                float fB = hzzVar.b();
                hzzVar.p();
                float fB2 = hzzVar.b();
                hzzVar.p();
                float fB3 = hzzVar.b();
                hzzVar.p();
                float fB4 = hzzVar.b();
                if (Float.isNaN(fB) || Float.isNaN(fB2) || Float.isNaN(fB3) || Float.isNaN(fB4)) {
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                }
                if (fB3 < 0.0f) {
                    throw new SAXException("Invalid viewBox. width cannot be negative");
                }
                if (fB4 < 0.0f) {
                    throw new SAXException("Invalid viewBox. height cannot be negative");
                }
                hytVar.w = new hxf(fB, fB2, fB3, fB4);
            }
        }
    }

    private static float F(String str, int i) throws SAXException {
        float fA = new hxc().a(str, 0, i);
        if (Float.isNaN(fA)) {
            throw new SAXException("Invalid float value: ".concat(String.valueOf(str)));
        }
        return fA;
    }

    private static final Matrix G(String str) throws SAXException {
        Matrix matrix = new Matrix();
        hzz hzzVar = new hzz(str);
        hzzVar.k();
        while (!hzzVar.n()) {
            String strSubstring = null;
            if (!hzzVar.n()) {
                int i = hzzVar.b;
                int iCharAt = hzzVar.a.charAt(i);
                while (true) {
                    if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                        break;
                    }
                    iCharAt = hzzVar.d();
                }
                int i2 = hzzVar.b;
                while (hzz.s(iCharAt)) {
                    iCharAt = hzzVar.d();
                }
                if (iCharAt == 40) {
                    hzzVar.b++;
                    strSubstring = hzzVar.a.substring(i, i2);
                } else {
                    hzzVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
            if (strSubstring.equals("matrix")) {
                hzzVar.k();
                float fB = hzzVar.b();
                hzzVar.p();
                float fB2 = hzzVar.b();
                hzzVar.p();
                float fB3 = hzzVar.b();
                hzzVar.p();
                float fB4 = hzzVar.b();
                hzzVar.p();
                float fB5 = hzzVar.b();
                hzzVar.p();
                float fB6 = hzzVar.b();
                hzzVar.k();
                if (Float.isNaN(fB6) || !hzzVar.l(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{fB, fB3, fB5, fB2, fB4, fB6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (strSubstring.equals("translate")) {
                hzzVar.k();
                float fB7 = hzzVar.b();
                float fC = hzzVar.c();
                hzzVar.k();
                if (Float.isNaN(fB7) || !hzzVar.l(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fC)) {
                    matrix.preTranslate(fB7, 0.0f);
                } else {
                    matrix.preTranslate(fB7, fC);
                }
            } else if (strSubstring.equals("scale")) {
                hzzVar.k();
                float fB8 = hzzVar.b();
                float fC2 = hzzVar.c();
                hzzVar.k();
                if (Float.isNaN(fB8) || !hzzVar.l(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fC2)) {
                    matrix.preScale(fB8, fB8);
                } else {
                    matrix.preScale(fB8, fC2);
                }
            } else if (strSubstring.equals("rotate")) {
                hzzVar.k();
                float fB9 = hzzVar.b();
                float fC3 = hzzVar.c();
                float fC4 = hzzVar.c();
                hzzVar.k();
                if (Float.isNaN(fB9) || !hzzVar.l(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fC3)) {
                    matrix.preRotate(fB9);
                } else {
                    if (Float.isNaN(fC4)) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preRotate(fB9, fC3, fC4);
                }
            } else if (strSubstring.equals("skewX")) {
                hzzVar.k();
                float fB10 = hzzVar.b();
                hzzVar.k();
                if (Float.isNaN(fB10) || !hzzVar.l(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(fB10)), 0.0f);
            } else {
                if (!strSubstring.equals("skewY")) {
                    throw new SAXException(a.cg(strSubstring, "Invalid transform list fn: ", ")"));
                }
                hzzVar.k();
                float fB11 = hzzVar.b();
                hzzVar.k();
                if (Float.isNaN(fB11) || !hzzVar.l(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fB11)));
            }
            if (hzzVar.n()) {
                break;
            }
            hzzVar.p();
        }
        return matrix;
    }

    private static final void H(hxm hxmVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = hzx.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 23) {
                int i2 = 1;
                if (iOrdinal != 24) {
                    if (iOrdinal != 26) {
                        if (iOrdinal != 60) {
                            continue;
                        } else {
                            try {
                                int iHashCode = strTrim.hashCode();
                                if (iHashCode == -934531685) {
                                    if (!strTrim.equals("repeat")) {
                                        throw new IllegalArgumentException();
                                    }
                                    i2 = 3;
                                    hxmVar.e = i2;
                                } else if (iHashCode == 110739) {
                                    if (!strTrim.equals("pad")) {
                                        throw new IllegalArgumentException();
                                    }
                                    hxmVar.e = i2;
                                } else {
                                    if (iHashCode != 1085265597 || !strTrim.equals("reflect")) {
                                        throw new IllegalArgumentException();
                                    }
                                    i2 = 2;
                                    hxmVar.e = i2;
                                }
                            } catch (IllegalArgumentException unused) {
                                throw new SAXException(a.cg(strTrim, "Invalid spreadMethod attribute. \"", "\" is not a valid value."));
                            }
                        }
                    } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        hxmVar.d = strTrim;
                    }
                } else if ("objectBoundingBox".equals(strTrim)) {
                    hxmVar.b = false;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SAXException("Invalid value for attribute gradientUnits");
                    }
                    hxmVar.b = true;
                }
            } else {
                hxmVar.c = G(strTrim);
            }
        }
    }

    private static final void I(hxp hxpVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (hzx.a(attributes.getLocalName(i)) == hzx.transform) {
                hxpVar.a(G(attributes.getValue(i)));
            }
        }
    }

    protected static hxr a(String str) throws SAXException {
        int i;
        int iL;
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        int i2 = length - 1;
        char cCharAt = str.charAt(i2);
        try {
            if (cCharAt != '%') {
                i = 1;
                if (length > 2 && Character.isLetter(cCharAt)) {
                    i2 = length - 2;
                    if (Character.isLetter(str.charAt(i2))) {
                        try {
                            iL = hju.l(str.substring(i2).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                            throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                        }
                    }
                }
                return new hxr(F(str, length), i);
            }
            iL = 9;
            return new hxr(F(str, length), i);
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
        }
        i = iL;
        length = i2;
    }

    public static void c(hyg hygVar, String str, String str2) {
        Boolean bool;
        String strJ;
        int i;
        hxr hxrVarE;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = hzx.a(str).ordinal();
        int i2 = 5;
        iom iomVar = null;
        hxrVarArr = null;
        hxrVarArr = null;
        hxr[] hxrVarArr = null;
        String strSubstring = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2)) {
                if (!str2.toLowerCase(Locale.US).startsWith("rect(")) {
                    throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                }
                hzz hzzVar = new hzz(str2.substring(5));
                hzzVar.k();
                hxr hxrVarI = i(hzzVar);
                hzzVar.p();
                hxr hxrVarI2 = i(hzzVar);
                hzzVar.p();
                hxr hxrVarI3 = i(hzzVar);
                hzzVar.p();
                hxr hxrVarI4 = i(hzzVar);
                hzzVar.k();
                if (!hzzVar.l(')')) {
                    throw new SAXException("Bad rect() clip definition: ".concat(String.valueOf(str2)));
                }
                iomVar = new iom(hxrVarI, hxrVarI2, hxrVarI3, hxrVarI4);
            }
            hygVar.L = iomVar;
            hygVar.a |= 1048576;
            return;
        }
        if (iOrdinal == 2) {
            hygVar.w = l(str2, str);
            hygVar.a |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            hygVar.J = x(str2);
            hygVar.a |= 536870912;
            return;
        }
        if (iOrdinal == 5) {
            hygVar.k = g(str2);
            hygVar.a |= 4096;
            return;
        }
        if (iOrdinal == 8) {
            if (!"ltr".equals(str2)) {
                if (!"rtl".equals(str2)) {
                    throw new SAXException("Invalid direction property: ".concat(String.valueOf(str2)));
                }
                i = 2;
            }
            hygVar.H = i;
            hygVar.a |= 68719476736L;
            return;
        }
        if (iOrdinal == 35) {
            hygVar.x = l(str2, str);
            hygVar.a |= 1073741824;
            return;
        }
        if (iOrdinal == 40) {
            hygVar.j = Float.valueOf(e(str2));
            hygVar.a |= 2048;
            return;
        }
        if (iOrdinal == 42) {
            if ("visible".equals(str2) || "auto".equals(str2)) {
                bool = Boolean.TRUE;
            } else {
                if (!"hidden".equals(str2) && !"scroll".equals(str2)) {
                    throw new SAXException("Invalid toverflow property: ".concat(String.valueOf(str2)));
                }
                bool = Boolean.FALSE;
            }
            hygVar.o = bool;
            hygVar.a |= 524288;
            return;
        }
        if (iOrdinal == 78) {
            if (!"none".equals(str2)) {
                if (!"non-scaling-stroke".equals(str2)) {
                    throw new SAXException("Invalid vector-effect property: ".concat(String.valueOf(str2)));
                }
                i = 2;
            }
            hygVar.K = i;
            hygVar.a |= 34359738368L;
            return;
        }
        if (iOrdinal == 58) {
            if (str2.equals("currentColor")) {
                hygVar.y = hxj.a;
            } else {
                hygVar.y = g(str2);
            }
            hygVar.a |= 2147483648L;
            return;
        }
        if (iOrdinal == 59) {
            hygVar.z = Float.valueOf(e(str2));
            hygVar.a |= 4294967296L;
            return;
        }
        if (iOrdinal == 74) {
            if (!"start".equals(str2)) {
                if ("middle".equals(str2)) {
                    i = 2;
                } else {
                    if (!"end".equals(str2)) {
                        throw new SAXException("Invalid text-anchor property: ".concat(String.valueOf(str2)));
                    }
                    i = 3;
                }
            }
            hygVar.I = i;
            hygVar.a |= 262144;
            return;
        }
        if (iOrdinal == 75) {
            if ("none".equals(str2)) {
                i2 = 1;
            } else if ("underline".equals(str2)) {
                i2 = 2;
            } else if ("overline".equals(str2)) {
                i2 = 3;
            } else if ("line-through".equals(str2)) {
                i2 = 4;
            } else if (!"blink".equals(str2)) {
                throw new SAXException("Invalid text-decoration property: ".concat(String.valueOf(str2)));
            }
            hygVar.G = i2;
            hygVar.a |= 131072;
            return;
        }
        switch (iOrdinal) {
            case 14:
                if (str2.indexOf(R.styleable.AppCompatTheme_windowMinWidthMajor) >= 0 || "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf(a.cg(str2, "|", "|")) == -1) {
                    throw new SAXException("Invalid value for \"display\" attribute: ".concat(String.valueOf(str2)));
                }
                hygVar.s = Boolean.valueOf(!str2.equals("none"));
                hygVar.a |= 16777216;
                return;
            case 15:
                hygVar.b = k(str2, "fill");
                hygVar.a |= 1;
                return;
            case 16:
                hygVar.C = x(str2);
                hygVar.a |= 2;
                return;
            case 17:
                hygVar.c = Float.valueOf(e(str2));
                hygVar.a |= 4;
                return;
            case 18:
                if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf(a.cg(str2, "|", "|")) == -1) {
                    hzz hzzVar2 = new hzz(str2);
                    int iY = 0;
                    Integer numA = null;
                    String str3 = null;
                    while (true) {
                        strJ = hzzVar2.j('/');
                        hzzVar2.k();
                        if (strJ == null) {
                            throw new SAXException("Invalid font style attribute: missing font size and family");
                        }
                        if (numA == null) {
                            i = iY;
                        } else if (iY == 0) {
                            i = 0;
                        }
                        if (!strJ.equals("normal") && (numA != null || (numA = hzw.a(strJ)) == null)) {
                            if (i == 0) {
                                iY = y(strJ);
                                if (iY != 0) {
                                    continue;
                                }
                            } else {
                                iY = i;
                            }
                            if (str3 == null && strJ.equals("small-caps")) {
                                str3 = strJ;
                            }
                        }
                    }
                    hxr hxrVarH = h(strJ);
                    if (hzzVar2.l('/')) {
                        hzzVar2.k();
                        String strI = hzzVar2.i();
                        if (strI == null) {
                            throw new SAXException("Invalid font style attribute: missing line-height");
                        }
                        a(strI);
                        hzzVar2.k();
                    }
                    if (!hzzVar2.n()) {
                        int i3 = hzzVar2.b;
                        hzzVar2.b = hzzVar2.c;
                        strSubstring = hzzVar2.a.substring(i3);
                    }
                    hygVar.l = m(strSubstring);
                    hygVar.m = hxrVarH;
                    hygVar.n = Integer.valueOf(numA == null ? 400 : numA.intValue());
                    hygVar.F = iY != 0 ? iY : 1;
                    hygVar.a |= 122880;
                    return;
                }
                return;
            case 19:
                hygVar.l = m(str2);
                hygVar.a |= 8192;
                return;
            case 20:
                hygVar.m = h(str2);
                hygVar.a |= 16384;
                return;
            case 21:
                Integer numA2 = hzw.a(str2);
                if (numA2 == null) {
                    throw new SAXException("Invalid font-weight property: ".concat(String.valueOf(str2)));
                }
                hygVar.n = numA2;
                hygVar.a |= 32768;
                return;
            case 22:
                int iY2 = y(str2);
                if (iY2 == 0) {
                    throw new SAXException("Invalid font-style property: ".concat(String.valueOf(str2)));
                }
                hygVar.F = iY2;
                hygVar.a |= 65536;
                return;
            default:
                switch (iOrdinal) {
                    case 28:
                        hygVar.p = l(str2, str);
                        String str4 = hygVar.p;
                        hygVar.q = str4;
                        hygVar.r = str4;
                        hygVar.a |= 14680064;
                        return;
                    case 29:
                        hygVar.p = l(str2, str);
                        hygVar.a |= 2097152;
                        return;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        hygVar.q = l(str2, str);
                        hygVar.a |= 4194304;
                        return;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        hygVar.r = l(str2, str);
                        hygVar.a |= 8388608;
                        return;
                    default:
                        switch (iOrdinal) {
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                if (str2.equals("currentColor")) {
                                    hygVar.u = hxj.a;
                                } else {
                                    hygVar.u = g(str2);
                                }
                                hygVar.a |= 67108864;
                                return;
                            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                hygVar.v = Float.valueOf(e(str2));
                                hygVar.a |= 134217728;
                                return;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                hygVar.d = k(str2, "stroke");
                                hygVar.a |= 8;
                                return;
                            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                if ("none".equals(str2)) {
                                    hygVar.h = null;
                                } else {
                                    hzz hzzVar3 = new hzz(str2);
                                    hzzVar3.k();
                                    if (!hzzVar3.n() && (hxrVarE = hzzVar3.e()) != null) {
                                        if (hxrVarE.e()) {
                                            throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                        }
                                        float f = hxrVarE.a;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(hxrVarE);
                                        while (!hzzVar3.n()) {
                                            hzzVar3.p();
                                            hxr hxrVarE2 = hzzVar3.e();
                                            if (hxrVarE2 == null) {
                                                throw new SAXException("Invalid stroke-dasharray. Non-Length content found: ".concat(String.valueOf(str2)));
                                            }
                                            if (hxrVarE2.e()) {
                                                throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                            }
                                            arrayList.add(hxrVarE2);
                                            f += hxrVarE2.a;
                                        }
                                        if (f != 0.0f) {
                                            hxrVarArr = (hxr[]) arrayList.toArray(new hxr[arrayList.size()]);
                                        }
                                    }
                                    hygVar.h = hxrVarArr;
                                }
                                hygVar.a |= 512;
                                return;
                            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                hygVar.i = a(str2);
                                hygVar.a |= 1024;
                                return;
                            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                if (!"butt".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i = 2;
                                    } else {
                                        if (!"square".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linecap property: ".concat(String.valueOf(str2)));
                                        }
                                        i = 3;
                                    }
                                }
                                hygVar.D = i;
                                hygVar.a |= 64;
                                return;
                            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                if (!"miter".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i = 2;
                                    } else {
                                        if (!"bevel".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linejoin property: ".concat(String.valueOf(str2)));
                                        }
                                        i = 3;
                                    }
                                }
                                hygVar.E = i;
                                hygVar.a |= 128;
                                return;
                            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                hygVar.g = Float.valueOf(d(str2));
                                hygVar.a |= 256;
                                return;
                            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                hygVar.e = Float.valueOf(e(str2));
                                hygVar.a |= 16;
                                return;
                            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                hygVar.f = a(str2);
                                hygVar.a |= 32;
                                return;
                            default:
                                switch (iOrdinal) {
                                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                        if (str2.equals("currentColor")) {
                                            hygVar.A = hxj.a;
                                        } else {
                                            hygVar.A = g(str2);
                                        }
                                        hygVar.a |= 8589934592L;
                                        return;
                                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                        hygVar.B = Float.valueOf(e(str2));
                                        hygVar.a |= 17179869184L;
                                        return;
                                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                        if (str2.indexOf(R.styleable.AppCompatTheme_windowMinWidthMajor) >= 0 || "|visible|hidden|collapse|".indexOf(a.cg(str2, "|", "|")) == -1) {
                                            throw new SAXException("Invalid value for \"visibility\" attribute: ".concat(String.valueOf(str2)));
                                        }
                                        hygVar.t = Boolean.valueOf(str2.equals("visible"));
                                        hygVar.a |= 33554432;
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    private static float d(String str) throws SAXException {
        int length = str.length();
        if (length != 0) {
            return F(str, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    private static float e(String str) throws SAXException {
        float fD = d(str);
        if (fD < 0.0f) {
            return 0.0f;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    private static int f(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private static hxi g(String str) throws SAXException {
        long j;
        int i;
        if (str.charAt(0) != '#') {
            if (!str.toLowerCase(Locale.US).startsWith("rgb(")) {
                Integer num = (Integer) hzu.a.get(str.toLowerCase(Locale.US));
                if (num != null) {
                    return new hxi(num.intValue());
                }
                throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
            }
            hzz hzzVar = new hzz(str.substring(4));
            hzzVar.k();
            float fB = hzzVar.b();
            if (!Float.isNaN(fB) && hzzVar.l('%')) {
                fB = (fB * 256.0f) / 100.0f;
            }
            float fA = hzzVar.a(fB);
            if (!Float.isNaN(fA) && hzzVar.l('%')) {
                fA = (fA * 256.0f) / 100.0f;
            }
            float fA2 = hzzVar.a(fA);
            if (!Float.isNaN(fA2) && hzzVar.l('%')) {
                fA2 = (fA2 * 256.0f) / 100.0f;
            }
            hzzVar.k();
            if (Float.isNaN(fA2) || !hzzVar.l(')')) {
                throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
            }
            return new hxi((f(fB) << 16) | (f(fA) << 8) | f(fA2));
        }
        int length = str.length();
        aacv aacvVar = null;
        if (length > 1) {
            long j2 = 0;
            int i2 = 1;
            while (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt >= 'A' && cCharAt <= 'F') {
                        j = j2 * 16;
                        i = cCharAt - 'A';
                    } else {
                        if (cCharAt < 'a' || cCharAt > 'f') {
                            break;
                        }
                        j = j2 * 16;
                        i = cCharAt - 'a';
                    }
                    j2 = j + i + 10;
                } else {
                    j2 = (j2 * 16) + (cCharAt - '0');
                }
                if (j2 > 4294967295L) {
                    break;
                }
                i2++;
            }
            if (i2 != 1) {
                aacvVar = new aacv(j2, i2);
            }
        }
        if (aacvVar == null) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int i3 = aacvVar.a;
        if (i3 == 7) {
            return new hxi(aacvVar.a());
        }
        if (i3 != 4) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int iA = aacvVar.a();
        int i4 = iA & 3840;
        int i5 = iA & 240;
        int i6 = iA & 15;
        return new hxi(i6 | (i4 << 8) | (i4 << 12) | (-16777216) | (i5 << 8) | (i5 << 4) | (i6 << 4));
    }

    private static hxr h(String str) {
        hxr hxrVar = (hxr) hzv.a.get(str);
        return hxrVar == null ? a(str) : hxrVar;
    }

    private static hxr i(hzz hzzVar) {
        return hzzVar.m("auto") ? new hxr(0.0f) : hzzVar.e();
    }

    private static hyq j(String str) {
        if (str.equals("none")) {
            return null;
        }
        return str.equals("currentColor") ? hxj.a : g(str);
    }

    private static hyq k(String str, String str2) throws SAXException {
        if (!str.startsWith("url(")) {
            return j(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            throw new SAXException(a.cg(str2, "Bad ", " attribute. Unterminated url() reference"));
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new hxw(strTrim, strTrim2.length() > 0 ? j(strTrim2) : null);
    }

    private static String l(String str, String str2) throws SAXException {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new SAXException(a.cg(str2, "Bad ", " attribute. Expected \"none\" or \"url()\" format"));
    }

    private static List m(String str) {
        hzz hzzVar = new hzz(str);
        ArrayList arrayList = null;
        do {
            String strH = hzzVar.h();
            if (strH == null) {
                strH = hzzVar.j(',');
            }
            if (strH == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strH);
            hzzVar.p();
        } while (!hzzVar.n());
        return arrayList;
    }

    private static List n(String str) throws SAXException {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        hzz hzzVar = new hzz(str);
        hzzVar.k();
        while (!hzzVar.n()) {
            float fB = hzzVar.b();
            if (Float.isNaN(fB)) {
                int i = hzzVar.b;
                while (!hzzVar.n() && !hzz.s(hzzVar.a.charAt(hzzVar.b))) {
                    hzzVar.b++;
                }
                String strSubstring = hzzVar.a.substring(i, hzzVar.b);
                hzzVar.b = i;
                throw new SAXException("Invalid length list value: ".concat(String.valueOf(strSubstring)));
            }
            int iQ = hzzVar.q();
            if (iQ == 0) {
                iQ = 1;
            }
            arrayList.add(new hxr(fB, iQ));
            hzzVar.p();
        }
        return arrayList;
    }

    private final void o(Attributes attributes) throws SAXException {
        hyl hylVar = this.b;
        if (hylVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        hxg hxgVar = new hxg();
        hxgVar.t = this.a;
        hxgVar.u = hylVar;
        A(hxgVar, attributes);
        C(hxgVar, attributes);
        I(hxgVar, attributes);
        z(hxgVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = hzx.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                hxgVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                hxgVar.b = a(strTrim);
            } else if (iOrdinal != 49) {
                continue;
            } else {
                hxgVar.c = a(strTrim);
                if (hxgVar.c.e()) {
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.b.b(hxgVar);
    }

    private final void p(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        hxh hxhVar = new hxh();
        hxhVar.t = this.a;
        hxhVar.u = this.b;
        A(hxhVar, attributes);
        C(hxhVar, attributes);
        I(hxhVar, attributes);
        z(hxhVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (hzx.a(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(strTrim)) {
                    hxhVar.a = false;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SAXException("Invalid value for attribute clipPathUnits");
                    }
                    hxhVar.a = true;
                }
            }
        }
        this.b.b(hxhVar);
        this.b = hxhVar;
    }

    private final void q(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        hxk hxkVar = new hxk();
        hxkVar.t = this.a;
        hxkVar.u = this.b;
        A(hxkVar, attributes);
        C(hxkVar, attributes);
        I(hxkVar, attributes);
        this.b.b(hxkVar);
        this.b = hxkVar;
    }

    private final void r(Attributes attributes) throws SAXException {
        hyl hylVar = this.b;
        if (hylVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        hxl hxlVar = new hxl();
        hxlVar.t = this.a;
        hxlVar.u = hylVar;
        A(hxlVar, attributes);
        C(hxlVar, attributes);
        I(hxlVar, attributes);
        z(hxlVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = hzx.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                hxlVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                hxlVar.b = a(strTrim);
            } else if (iOrdinal == 56) {
                hxlVar.c = a(strTrim);
                if (hxlVar.c.e()) {
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (iOrdinal != 57) {
                continue;
            } else {
                hxlVar.d = a(strTrim);
                if (hxlVar.d.e()) {
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
        this.b.b(hxlVar);
    }

    private final void s(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        hxo hxoVar = new hxo();
        hxoVar.t = this.a;
        hxoVar.u = this.b;
        A(hxoVar, attributes);
        C(hxoVar, attributes);
        I(hxoVar, attributes);
        z(hxoVar, attributes);
        this.b.b(hxoVar);
        this.b = hxoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t(org.xml.sax.Attributes r6) throws org.xml.sax.SAXException {
        /*
            r5 = this;
            hyl r0 = r5.b
            if (r0 == 0) goto La1
            hxq r0 = new hxq
            r0.<init>()
            hzg r1 = r5.a
            r0.t = r1
            hyl r1 = r5.b
            r0.u = r1
            A(r0, r6)
            C(r0, r6)
            I(r0, r6)
            z(r0, r6)
            r1 = 0
        L1e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L99
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            hzx r3 = defpackage.hzx.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L80
            r4 = 26
            if (r3 == r4) goto L71
            r4 = 48
            if (r3 == r4) goto L6d
            switch(r3) {
                case 81: goto L56;
                case 82: goto L4f;
                case 83: goto L48;
                default: goto L47;
            }
        L47:
            goto L8e
        L48:
            hxr r2 = a(r2)
            r0.c = r2
            goto L8e
        L4f:
            hxr r2 = a(r2)
            r0.b = r2
            goto L8e
        L56:
            hxr r2 = a(r2)
            r0.d = r2
            hxr r2 = r0.d
            boolean r2 = r2.e()
            if (r2 != 0) goto L65
            goto L8e
        L65:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L6d:
            w(r0, r2)
            goto L8e
        L71:
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8e
            r0.a = r2
            goto L8e
        L80:
            hxr r2 = a(r2)
            r0.e = r2
            hxr r2 = r0.e
            boolean r2 = r2.e()
            if (r2 != 0) goto L91
        L8e:
            int r1 = r1 + 1
            goto L1e
        L91:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L99:
            hyl r6 = r5.b
            r6.b(r0)
            r5.b = r0
            return
        La1:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iaa.t(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void u(org.xml.sax.Attributes r7) throws org.xml.sax.SAXException {
        /*
            r6 = this;
            hyl r0 = r6.b
            if (r0 == 0) goto Lcc
            hxt r0 = new hxt
            r0.<init>()
            hzg r1 = r6.a
            r0.t = r1
            hyl r1 = r6.b
            r0.u = r1
            A(r0, r7)
            C(r0, r7)
            z(r0, r7)
            E(r0, r7)
            r1 = 0
            r2 = r1
        L1f:
            int r3 = r7.getLength()
            if (r2 >= r3) goto Lc4
            java.lang.String r3 = r7.getValue(r2)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r7.getLocalName(r2)
            hzx r4 = defpackage.hzx.a(r4)
            int r4 = r4.ordinal()
            r5 = 41
            if (r4 == r5) goto La5
            r5 = 50
            if (r4 == r5) goto L9e
            r5 = 51
            if (r4 == r5) goto L97
            switch(r4) {
                case 32: goto L80;
                case 33: goto L61;
                case 34: goto L4a;
                default: goto L48;
            }
        L48:
            goto Lc0
        L4a:
            hxr r3 = a(r3)
            r0.d = r3
            hxr r3 = r0.d
            boolean r3 = r3.e()
            if (r3 != 0) goto L59
            goto Lc0
        L59:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            r7.<init>(r0)
            throw r7
        L61:
            java.lang.String r4 = "strokeWidth"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L6c
            r0.a = r1
            goto Lc0
        L6c:
            java.lang.String r4 = "userSpaceOnUse"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L78
            r3 = 1
            r0.a = r3
            goto Lc0
        L78:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            r7.<init>(r0)
            throw r7
        L80:
            hxr r3 = a(r3)
            r0.e = r3
            hxr r3 = r0.e
            boolean r3 = r3.e()
            if (r3 != 0) goto L8f
            goto Lc0
        L8f:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            r7.<init>(r0)
            throw r7
        L97:
            hxr r3 = a(r3)
            r0.c = r3
            goto Lc0
        L9e:
            hxr r3 = a(r3)
            r0.b = r3
            goto Lc0
        La5:
            java.lang.String r4 = "auto"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto Lb6
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
            goto Lc0
        Lb6:
            float r3 = d(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
        Lc0:
            int r2 = r2 + 1
            goto L1f
        Lc4:
            hyl r7 = r6.b
            r7.b(r0)
            r6.b = r0
            return
        Lcc:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iaa.u(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(org.xml.sax.Attributes r8) throws org.xml.sax.SAXException {
        /*
            r7 = this;
            hyl r0 = r7.b
            if (r0 == 0) goto Lb4
            hxu r0 = new hxu
            r0.<init>()
            hzg r1 = r7.a
            r0.t = r1
            hyl r1 = r7.b
            r0.u = r1
            A(r0, r8)
            C(r0, r8)
            z(r0, r8)
            r1 = 0
        L1b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lac
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            hzx r3 = defpackage.hzx.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L92
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L7d
            r4 = 37
            if (r3 == r4) goto L68
            switch(r3) {
                case 81: goto L51;
                case 82: goto L4d;
                case 83: goto L49;
                default: goto L48;
            }
        L48:
            goto La0
        L49:
            a(r2)
            goto La0
        L4d:
            a(r2)
            goto La0
        L51:
            hxr r2 = a(r2)
            r0.a = r2
            hxr r2 = r0.a
            boolean r2 = r2.e()
            if (r2 != 0) goto L60
            goto La0
        L60:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L68:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L75
            goto La0
        L75:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L7d:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
            goto La0
        L8a:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        L92:
            hxr r2 = a(r2)
            r0.b = r2
            hxr r2 = r0.b
            boolean r2 = r2.e()
            if (r2 != 0) goto La4
        La0:
            int r1 = r1 + 1
            goto L1b
        La4:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        Lac:
            hyl r8 = r7.b
            r8.b(r0)
            r7.b = r0
            return
        Lb4:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iaa.v(org.xml.sax.Attributes):void");
    }

    private static void w(hyr hyrVar, String str) throws SAXException {
        int i;
        hzz hzzVar = new hzz(str);
        hzzVar.k();
        String strI = hzzVar.i();
        if ("defer".equals(strI)) {
            hzzVar.k();
            strI = hzzVar.i();
        }
        hxd hxdVar = (hxd) hzt.a.get(strI);
        hzzVar.k();
        if (hzzVar.n()) {
            i = 0;
        } else {
            String strI2 = hzzVar.i();
            if (strI2.equals("meet")) {
                i = 1;
            } else {
                if (!strI2.equals("slice")) {
                    throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
                }
                i = 2;
            }
        }
        hyrVar.v = new hxe(hxdVar, i);
    }

    private static int x(String str) throws SAXException {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if ("evenodd".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
    }

    private static int y(String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        if ("normal".equals(str)) {
            return 1;
        }
        return "oblique".equals(str) ? 3 : 0;
    }

    private static final void z(hyi hyiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = hzx.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        hzz hzzVar = new hzz(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!hzzVar.n()) {
                            String strI = hzzVar.i();
                            if (strI.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strI.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            hzzVar.k();
                        }
                        hyiVar.i(hashSet);
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        hyiVar.h(strTrim);
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        hzz hzzVar2 = new hzz(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!hzzVar2.n()) {
                            hashSet2.add(hzzVar2.i());
                            hzzVar2.k();
                        }
                        hyiVar.k(hashSet2);
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        List listM = m(strTrim);
                        hyiVar.j(listM != null ? new HashSet(listM) : new HashSet(0));
                        break;
                }
            } else {
                hzz hzzVar3 = new hzz(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!hzzVar3.n()) {
                    String strI2 = hzzVar3.i();
                    int iIndexOf = strI2.indexOf(45);
                    if (iIndexOf != -1) {
                        strI2 = strI2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strI2, "", "").getLanguage());
                    hzzVar3.k();
                }
                hyiVar.l(hashSet3);
            }
        }
    }

    public final hzg b(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new GZIPInputStream(inputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        try {
            try {
                try {
                    try {
                        XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(this);
                        xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                        xMLReader.parse(new InputSource(inputStream));
                        return this.a;
                    } catch (IOException e) {
                        throw new hzs("File error", e);
                    }
                } catch (ParserConfigurationException e2) {
                    throw new hzs("XML Parser problem", e2);
                }
            } catch (SAXException e3) {
                throw new hzs("SVG parse error: " + e3.getMessage(), e3);
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
            return;
        }
        if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
            return;
        }
        hyl hylVar = this.b;
        if (hylVar instanceof hza) {
            hyj hyjVar = (hyj) hylVar;
            int size = hyjVar.i.size();
            hyp hypVar = size == 0 ? null : (hyp) hyjVar.i.get(size - 1);
            if (!(hypVar instanceof hzd)) {
                ((hyj) this.b).b(new hzd(new String(cArr, i, i2)));
                return;
            }
            hzd hzdVar = (hzd) hypVar;
            hzdVar.a = String.valueOf(hzdVar.a).concat(new String(cArr, i, i2));
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        if (!this.c && this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            switch (hzy.a(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    this.b = ((hyp) this.b).u;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    hzy hzyVar = this.f;
                    if (hzyVar == hzy.title || hzyVar == hzy.desc) {
                        this.g.toString();
                    }
                    this.g.setLength(0);
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        rin rinVar = new rin(hwx.screen);
                        hzg hzgVar = this.a;
                        hzz hzzVar = new hzz(string, null);
                        hzzVar.k();
                        hzgVar.c.a(rinVar.f(hzzVar));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.a = new hzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:443:0x090b, code lost:
    
        android.util.Log.e("SVGParser", defpackage.hwy.a(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x00ea, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0484, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x064b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0a80, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06d3 A[PHI: r11
  0x06d3: PHI (r11v24 float) = (r11v1 float), (r11v2 float), (r11v2 float), (r11v2 float), (r11v1 float) binds: [B:346:0x06d1, B:605:0x06d3, B:366:0x073a, B:359:0x0710, B:350:0x06e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0912 A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void startElement(java.lang.String r23, java.lang.String r24, java.lang.String r25, org.xml.sax.Attributes r26) throws org.xml.sax.SAXException {
        /*
            Method dump skipped, instructions count: 2936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iaa.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }
}
