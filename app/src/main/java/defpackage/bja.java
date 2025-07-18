package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
class bja {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Context.class, AttributeSet.class};
    private static final HashMap c = new HashMap();

    public static final Preference a(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup, Context context, Object[] objArr, bje bjeVar, String[] strArr) throws Throwable {
        Throwable th;
        Object[] objArr2;
        XmlPullParser xmlPullParser2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int next;
        PreferenceGroup preferenceGroup2;
        PreferenceGroup preferenceGroup3;
        synchronized (objArr) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                objArr[0] = context;
                do {
                    try {
                        next = xmlPullParser.next();
                        try {
                            if (next == 2) {
                                PreferenceGroup preferenceGroup4 = (PreferenceGroup) d(xmlPullParser.getName(), attributeSetAsAttributeSet, context, objArr, strArr);
                                if (preferenceGroup == null) {
                                    preferenceGroup4.z(bjeVar);
                                    preferenceGroup2 = preferenceGroup4;
                                } else {
                                    preferenceGroup2 = preferenceGroup;
                                }
                                xmlPullParser2 = xmlPullParser;
                                try {
                                    b(xmlPullParser2, preferenceGroup2, attributeSetAsAttributeSet, context, objArr, bjeVar, strArr);
                                    preferenceGroup3 = preferenceGroup2;
                                } catch (InflateException e) {
                                    e = e;
                                    throw e;
                                } catch (IOException e2) {
                                    e = e2;
                                    iOException = e;
                                    InflateException inflateException = new InflateException(xmlPullParser2.getPositionDescription() + ": " + iOException.getMessage());
                                    inflateException.initCause(iOException);
                                    throw inflateException;
                                } catch (XmlPullParserException e3) {
                                    e = e3;
                                    xmlPullParserException = e;
                                    InflateException inflateException2 = new InflateException(xmlPullParserException.getMessage());
                                    inflateException2.initCause(xmlPullParserException);
                                    throw inflateException2;
                                }
                            }
                        } catch (InflateException e4) {
                            throw e4;
                        } catch (IOException e5) {
                            iOException = e5;
                            xmlPullParser2 = xmlPullParser;
                            InflateException inflateException3 = new InflateException(xmlPullParser2.getPositionDescription() + ": " + iOException.getMessage());
                            inflateException3.initCause(iOException);
                            throw inflateException3;
                        } catch (XmlPullParserException e6) {
                            xmlPullParserException = e6;
                            InflateException inflateException22 = new InflateException(xmlPullParserException.getMessage());
                            inflateException22.initCause(xmlPullParserException);
                            throw inflateException22;
                        } catch (Throwable th3) {
                            th = th3;
                            objArr2 = objArr;
                            throw th;
                        }
                    } catch (InflateException e7) {
                        e = e7;
                    } catch (IOException e8) {
                        e = e8;
                        xmlPullParser2 = xmlPullParser;
                    } catch (XmlPullParserException e9) {
                        e = e9;
                    }
                } while (next != 1);
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            } catch (Throwable th4) {
                th = th4;
                objArr2 = objArr;
                th = th;
                throw th;
            }
        }
        return preferenceGroup3;
    }

    private static final void b(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet, Context context, Object[] objArr, bje bjeVar, String[] strArr) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                } else {
                    next = 3;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.t = Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, preference.p());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceD = d(name, attributeSet, context, objArr, strArr);
                    ((PreferenceGroup) preference).W(preferenceD);
                    b(xmlPullParser, preferenceD, attributeSet, context, objArr, bjeVar, strArr);
                }
            }
        }
    }

    private static final Preference c(String str, String[] strArr, AttributeSet attributeSet, Context context, Object[] objArr) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) c.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (strArr != null) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (int i = 0; i < 2; i++) {
                            try {
                                cls = Class.forName(strArr[i] + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(a.g(str, attributeSet, ": Error inflating class "));
                            }
                            throw e;
                        }
                    } else {
                        cls = Class.forName(str, false, classLoader);
                    }
                    constructor = cls.getConstructor(b);
                    constructor.setAccessible(true);
                    c.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(a.g(str, attributeSet, ": Error inflating class "));
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private static final Preference d(String str, AttributeSet attributeSet, Context context, Object[] objArr, String[] strArr) {
        try {
            return str.indexOf(46) == -1 ? c(str, strArr, attributeSet, context, objArr) : c(str, null, attributeSet, context, objArr);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(a.g(str, attributeSet, ": Error inflating class (not found)"));
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(a.g(str, attributeSet, ": Error inflating class "));
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }
}
