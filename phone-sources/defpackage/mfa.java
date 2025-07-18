package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfa {
    public static final Attributes a = new mey();
    public static final Map b;
    private final SAXParserFactory c;

    static {
        HashMap map = new HashMap();
        map.put("http://xml.org/sax/features/namespaces", false);
        map.put("http://xml.org/sax/features/namespace-prefixes", true);
        b = DesugarCollections.unmodifiableMap(map);
    }

    public mfa(Map map) throws SAXNotRecognizedException, SAXNotSupportedException, ParserConfigurationException {
        map.getClass();
        try {
            this.c = SAXParserFactory.newInstance();
            for (Map.Entry entry : map.entrySet()) {
                this.c.setFeature((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        } catch (ParserConfigurationException | SAXNotRecognizedException | SAXNotSupportedException e) {
            throw new RuntimeException("SAX initilization error", e);
        }
    }

    public final Object a(InputStream inputStream, Map map) throws SAXException, IOException, mfh {
        XMLReader xMLReader;
        try {
            SAXParserFactory sAXParserFactory = this.c;
            synchronized (sAXParserFactory) {
                xMLReader = sAXParserFactory.newSAXParser().getXMLReader();
            }
            mez mezVar = new mez(map);
            xMLReader.setContentHandler(mezVar);
            xMLReader.parse(new InputSource(inputStream));
            Object obj = mezVar.a;
            if (obj != null) {
                return obj;
            }
            throw new mfh("XML is well-formed but invalid");
        } catch (ParserConfigurationException | SAXException e) {
            throw new mfh(e);
        }
    }
}
