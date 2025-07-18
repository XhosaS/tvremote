package defpackage;

import android.content.Context;
import android.media.tv.TvInputInfo;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewl {
    public static final ewl a = new ewl();
    private static final Set b = agqj.p(new String[]{"en", "de", "fr", "ja"});
    private static final Map c;
    private static final Map d;

    static {
        Map mapD = agrj.d(new agpi("HDMI 1", "port:hdmi_1"), new agpi("HDMI 2", "port:hdmi_2"), new agpi("HDMI 3", "port:hdmi_3"), new agpi("HDMI 4", "port:hdmi_4"));
        c = mapD;
        Set<Map.Entry> setEntrySet = mapD.entrySet();
        int iB = agrj.b(agqq.i(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            agpi agpiVar = new agpi((String) entry.getValue(), (String) entry.getKey());
            linkedHashMap.put(agpiVar.a, agpiVar.b);
        }
        d = linkedHashMap;
    }

    private ewl() {
    }

    private final void e(abaq abaqVar, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        abaqVar.d(charSequence.toString());
    }

    public final abaq a(ewk ewkVar) {
        ewkVar.getClass();
        abaq abaqVar = new abaq();
        CharSequence charSequence = ewkVar.a;
        ewl ewlVar = a;
        ewlVar.e(abaqVar, charSequence);
        ewlVar.e(abaqVar, ewkVar.b);
        ewk ewkVar2 = ewkVar.d;
        if (ewkVar2 != null) {
            ewlVar.e(abaqVar, ewkVar2.a);
            ewlVar.e(abaqVar, ewkVar2.b);
        }
        String language = Locale.getDefault().getLanguage();
        if (true != b.contains(language)) {
            language = "en";
        }
        language.getClass();
        abau abauVar = new abau();
        abauVar.l("lang", language);
        abauVar.k("name_synonym", abaqVar);
        abaq abaqVar2 = new abaq();
        abaqVar2.a.add(abauVar);
        return abaqVar2;
    }

    public final String b(String str) {
        str.getClass();
        return (String) Map.EL.getOrDefault(c, str, str);
    }

    public final String c(String str) {
        return (String) Map.EL.getOrDefault(d, str, str);
    }

    public final java.util.Map d(List list, Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<TvInputInfo> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TvInputInfo) obj).getType() == 1007) {
                arrayList.add(obj);
            }
        }
        for (TvInputInfo tvInputInfo : arrayList) {
            if (tvInputInfo.getHdmiDeviceInfo() == null || tvInputInfo.getParentId() == null) {
                linkedHashMap.put(tvInputInfo.getId(), new ewk(tvInputInfo, context));
            } else {
                linkedHashMap2.put(tvInputInfo.getParentId(), new ewk(tvInputInfo, context));
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (linkedHashMap2.keySet().contains(entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            ((ewk) entry2.getValue()).d = (ewk) linkedHashMap2.get(entry2.getKey());
        }
        Set setEntrySet = linkedHashMap.entrySet();
        int iB = agrj.b(agqq.i(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB);
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            ewk ewkVar = (ewk) ((Map.Entry) it.next()).getValue();
            agpi agpiVar = new agpi(ewkVar.a.toString(), ewkVar);
            linkedHashMap4.put(agpiVar.a, agpiVar.b);
        }
        return linkedHashMap4;
    }
}
