package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.litho.TextContent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsw {
    private static final HashSet a = new HashSet(Arrays.asList("delegate", "feedPrefetcher", "parentFeedContextChain", "child", "children", "childComponent", "trackingCode", "eventsController", "itemAnimator", "onScrollListeners", "recyclerConfiguration", "threadTileViewData", "textColorStateList", "typeface", "text", "params"));

    private static String a(Object obj, int i) {
        if (obj == null) {
            return "";
        }
        String strReplace = obj.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        return strReplace.length() > i ? String.valueOf(strReplace.substring(0, i)).concat("...") : strReplace;
    }

    public static void addViewDescription(dsu dsuVar, StringBuilder sb, int i, int i2, boolean z, boolean z2) {
        addViewDescription(dsuVar, sb, i, i2, z, z2, null);
    }

    public static void addViewDescription(dsu dsuVar, StringBuilder sb, int i, int i2, boolean z, boolean z2, dsv dsvVar) {
        eau eauVar;
        Object obj;
        dww dwwVar;
        sb.append("litho.");
        sb.append(dsuVar.b().d());
        sb.append('{');
        sb.append(Integer.toHexString(dsuVar.hashCode()));
        sb.append(' ');
        dvz dvzVarF = dsuVar.f();
        dsx dsxVarE = dsuVar.e();
        String str = ".";
        sb.append((dvzVarF == null || dvzVarF.getVisibility() != 0) ? "." : "V");
        sb.append((dsxVarE == null || (dwwVar = dsxVarE.b.f) == null || dwwVar.B != 1) ? "." : "F");
        sb.append((dvzVarF == null || !dvzVarF.isEnabled()) ? "." : "E");
        sb.append(".");
        sb.append((dvzVarF == null || !dvzVarF.isHorizontalScrollBarEnabled()) ? "." : "H");
        sb.append((dvzVarF == null || !dvzVarF.isVerticalScrollBarEnabled()) ? "." : "V");
        if (dsxVarE != null && dsxVarE.a() != null) {
            str = "C";
        }
        sb.append(str);
        sb.append(". .. ");
        Rect rectA = dsuVar.a();
        sb.append(rectA.left - i);
        sb.append(",");
        sb.append(rectA.top - i2);
        sb.append("-");
        sb.append(rectA.right - i);
        sb.append(",");
        sb.append(rectA.bottom - i2);
        String string = null;
        String str2 = dsuVar.h() ? dsuVar.b.w : null;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            sb.append(" litho:id/");
            sb.append(str2.replace(' ', '_'));
        }
        dvz dvzVarF2 = dsuVar.f();
        if (dvzVarF2 != null) {
            drq drqVarB = dsuVar.b();
            elu mountDelegateTarget = dvzVarF2.getMountDelegateTarget();
            int iA = mountDelegateTarget.a();
            int i3 = 0;
            while (true) {
                if (i3 >= iA) {
                    break;
                }
                elv elvVarJ = mountDelegateTarget.j(i3);
                drq drqVar = elvVarJ == null ? null : ((dvu) elvVarJ.d.b).b.c;
                if (drqVar != null && drqVar.j == drqVarB.j) {
                    Object obj2 = elvVarJ.a;
                    StringBuilder sb2 = new StringBuilder();
                    if (obj2 instanceof TextContent) {
                        Iterator it = ((TextContent) obj2).getTextItems().iterator();
                        while (it.hasNext()) {
                            sb2.append((CharSequence) it.next());
                        }
                    } else if (obj2 instanceof TextView) {
                        sb2.append(((TextView) obj2).getText());
                    }
                    if (sb2.length() != 0) {
                        string = sb2.toString();
                        break;
                    }
                }
                i3++;
            }
        }
        if (string != null && !TextUtils.isEmpty(string)) {
            sb.append(" text=\"");
            sb.append(a(string, 200));
            sb.append("\"");
        }
        if (z2) {
            drq drqVarB2 = dsuVar.b();
            JSONObject jSONObject = new JSONObject();
            for (Field field : drqVarB2.getClass().getDeclaredFields()) {
                try {
                    if (!a.contains(field.getName()) && (eauVar = (eau) field.getAnnotation(eau.class)) != null) {
                        field.setAccessible(true);
                        int iOrdinal = eauVar.a().ordinal();
                        if (iOrdinal == 1) {
                            String strA = a(field.get(drqVarB2), 50);
                            if (!TextUtils.isEmpty(strA)) {
                                jSONObject.put(field.getName(), strA);
                            }
                        } else if (iOrdinal != 11 && iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8 && (obj = field.get(drqVarB2)) != null) {
                            jSONObject.put(field.getName(), obj);
                        }
                    }
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", a(e.getMessage(), 50));
                    } catch (Exception unused) {
                    }
                }
            }
            if (jSONObject.length() > 0) {
                sb.append(" props=\"");
                sb.append(jSONObject.toString());
                sb.append("\"");
            }
        }
        if (dsvVar != null) {
            dsvVar.a();
        }
        if (!z && dsxVarE != null && dsxVarE.a() != null) {
            sb.append(" [clickable]");
        }
        sb.append('}');
    }
}
