package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zv {
    public static final void a(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            zt ztVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                break;
                            } else {
                                aac aacVar = new aac();
                                int attributeCount = xml.getAttributeCount();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= attributeCount) {
                                        break;
                                    } else {
                                        String attributeName = xml.getAttributeName(i2);
                                        String attributeValue = xml.getAttributeValue(i2);
                                        if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                            int i3 = -1;
                                            int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                            if (identifier != -1) {
                                                i3 = identifier;
                                            } else if (attributeValue.length() > 1) {
                                                i3 = Integer.parseInt(attributeValue.substring(1));
                                            } else {
                                                Log.e("ConstraintLayoutStates", "error in parsing id");
                                            }
                                            aacVar.f(context, xml);
                                            sparseArray2.put(i3, aacVar);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                zt ztVar2 = new zt(context, xml);
                                sparseArray.put(ztVar2.a, ztVar2);
                                ztVar = ztVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                zu zuVar = new zu(context, xml);
                                if (ztVar != null) {
                                    ztVar.b.add(zuVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", a.b(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", a.b(i, "Error parsing resource: "), e2);
        }
    }
}
