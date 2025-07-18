package defpackage;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsk extends nrp {
    public static final String d;
    final nsn A;
    private long B;
    public nln e;
    public Long f;
    public nsh g;
    public int h;
    final nsn i;
    final nsn j;
    final nsn k;
    final nsn l;
    final nsn m;
    final nsn n;
    final nsn o;
    final nsn p;
    public final nsn q;
    final nsn r;
    final nsn s;
    final nsn t;
    final nsn u;
    final nsn v;
    public final nsn w;
    public final nsn x;
    final nsn y;
    final nsn z;

    static {
        Pattern pattern = nrv.a;
        d = "urn:x-cast:com.google.cast.media";
    }

    public nsk() {
        super(d);
        this.h = -1;
        nsn nsnVar = new nsn(86400000L, "load");
        this.i = nsnVar;
        nsn nsnVar2 = new nsn(86400000L, "pause");
        this.j = nsnVar2;
        nsn nsnVar3 = new nsn(86400000L, "play");
        this.k = nsnVar3;
        nsn nsnVar4 = new nsn(86400000L, "stop");
        this.l = nsnVar4;
        nsn nsnVar5 = new nsn(10000L, "seek");
        this.m = nsnVar5;
        nsn nsnVar6 = new nsn(86400000L, "volume");
        this.n = nsnVar6;
        nsn nsnVar7 = new nsn(86400000L, "mute");
        this.o = nsnVar7;
        nsn nsnVar8 = new nsn(86400000L, "status");
        this.p = nsnVar8;
        nsn nsnVar9 = new nsn(86400000L, "activeTracks");
        this.q = nsnVar9;
        nsn nsnVar10 = new nsn(86400000L, "trackStyle");
        this.r = nsnVar10;
        nsn nsnVar11 = new nsn(86400000L, "queueInsert");
        this.s = nsnVar11;
        nsn nsnVar12 = new nsn(86400000L, "queueUpdate");
        this.t = nsnVar12;
        nsn nsnVar13 = new nsn(86400000L, "queueRemove");
        this.u = nsnVar13;
        nsn nsnVar14 = new nsn(86400000L, "queueReorder");
        this.v = nsnVar14;
        nsn nsnVar15 = new nsn(86400000L, "queueFetchItemIds");
        this.w = nsnVar15;
        nsn nsnVar16 = new nsn(86400000L, "queueFetchItemRange");
        this.y = nsnVar16;
        this.x = new nsn(86400000L, "queueFetchItems");
        nsn nsnVar17 = new nsn(86400000L, "setPlaybackRate");
        this.z = nsnVar17;
        nsn nsnVar18 = new nsn(86400000L, "skipAd");
        this.A = nsnVar18;
        e(nsnVar);
        e(nsnVar2);
        e(nsnVar3);
        e(nsnVar4);
        e(nsnVar5);
        e(nsnVar6);
        e(nsnVar7);
        e(nsnVar8);
        e(nsnVar9);
        e(nsnVar10);
        e(nsnVar11);
        e(nsnVar12);
        e(nsnVar13);
        e(nsnVar14);
        e(nsnVar15);
        e(nsnVar16);
        e(nsnVar16);
        e(nsnVar17);
        e(nsnVar18);
        t();
    }

    private static nsj s(JSONObject jSONObject) {
        MediaError mediaErrorA = MediaError.a(jSONObject);
        nsj nsjVar = new nsj();
        Pattern pattern = nrv.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        nsjVar.a = mediaErrorA;
        return nsjVar;
    }

    private final void t() {
        this.B = 0L;
        this.e = null;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((nsn) it.next()).d(2002);
        }
    }

    private final void u(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.h = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.a.d(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    private final void v() {
        nsh nshVar = this.g;
        if (nshVar != null) {
            nshVar.b();
        }
    }

    private final void w() {
        nsh nshVar = this.g;
        if (nshVar != null) {
            nshVar.c();
        }
    }

    private final void x() {
        nsh nshVar = this.g;
        if (nshVar != null) {
            nshVar.j();
        }
    }

    private final void y() {
        nsh nshVar = this.g;
        if (nshVar != null) {
            nshVar.l();
        }
    }

    private static int[] z(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    @Override // defpackage.nrp
    public final void b() {
        List list = this.c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((nsn) it.next()).d(2002);
            }
        }
        t();
    }

    public final long f(double d2, long j, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.B;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (jElapsedRealtime * d2));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final long g() {
        nln nlnVar;
        nlg nlgVar;
        MediaInfo mediaInfoJ = j();
        long jF = 0;
        if (mediaInfoJ == null || (nlnVar = this.e) == null) {
            return 0L;
        }
        Long l = this.f;
        if (l == null) {
            if (this.B == 0) {
                return 0L;
            }
            double d2 = nlnVar.d;
            long j = nlnVar.g;
            return (d2 == 0.0d || nlnVar.e != 2) ? j : f(d2, j, mediaInfoJ.d);
        }
        if (l.equals(4294967296000L)) {
            if (this.e.u != null) {
                long jLongValue = l.longValue();
                nln nlnVar2 = this.e;
                if (nlnVar2 != null && (nlgVar = nlnVar2.u) != null) {
                    boolean z = nlgVar.e;
                    long j2 = nlgVar.c;
                    jF = !z ? f(1.0d, j2, -1L) : j2;
                }
                return Math.min(jLongValue, jF);
            }
            if (i() >= 0) {
                return Math.min(l.longValue(), i());
            }
        }
        return l.longValue();
    }

    public final long h() throws nsi {
        nln nlnVar = this.e;
        if (nlnVar != null) {
            return nlnVar.b;
        }
        throw new nsi();
    }

    public final long i() {
        MediaInfo mediaInfoJ = j();
        if (mediaInfoJ != null) {
            return mediaInfoJ.d;
        }
        return 0L;
    }

    public final MediaInfo j() {
        nln nlnVar = this.e;
        if (nlnVar == null) {
            return null;
        }
        return nlnVar.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022d A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0237 A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024a A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025a A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0266 A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0270 A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0277 A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027e A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0285 A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0296 A[Catch: JSONException -> 0x02c8, TryCatch #0 {JSONException -> 0x02c8, blocks: (B:38:0x0090, B:41:0x009e, B:42:0x00ab, B:44:0x00b1, B:45:0x00c2, B:47:0x00c8, B:49:0x00d4, B:51:0x00e8, B:56:0x00f8, B:60:0x0106, B:62:0x011b, B:64:0x0134, B:68:0x0142, B:72:0x0150, B:74:0x0156, B:76:0x0162, B:78:0x016c, B:80:0x0172, B:81:0x0178, B:83:0x017e, B:84:0x018c, B:86:0x0190, B:88:0x0199, B:89:0x01a6, B:91:0x01ac, B:92:0x01bc, B:94:0x01c8, B:96:0x01d2, B:97:0x01df, B:99:0x01e5, B:100:0x01f3, B:102:0x01ff, B:104:0x0211, B:115:0x022d, B:118:0x0232, B:120:0x0246, B:122:0x024a, B:124:0x0256, B:126:0x025a, B:127:0x0262, B:129:0x0266, B:130:0x026c, B:132:0x0270, B:133:0x0273, B:135:0x0277, B:136:0x027a, B:138:0x027e, B:139:0x0281, B:141:0x0285, B:143:0x028f, B:144:0x0292, B:146:0x0296, B:148:0x029f, B:150:0x02b2, B:151:0x02b8, B:153:0x02be, B:119:0x0237, B:108:0x021b, B:110:0x0223, B:149:0x02a3), top: B:162:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsk.k(java.lang.String):void");
    }

    public final void l(long j, int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((nsn) it.next()).e(j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0276 A[Catch: JSONException -> 0x02c6, TryCatch #2 {JSONException -> 0x02c6, blocks: (B:151:0x025e, B:153:0x0269, B:155:0x0276, B:156:0x027f, B:158:0x02a6, B:159:0x02ad, B:161:0x02b0, B:162:0x02b8, B:163:0x02bb), top: B:185:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a6 A[Catch: JSONException -> 0x02c6, TryCatch #2 {JSONException -> 0x02c6, blocks: (B:151:0x025e, B:153:0x0269, B:155:0x0276, B:156:0x027f, B:158:0x02a6, B:159:0x02ad, B:161:0x02b0, B:162:0x02b8, B:163:0x02bb), top: B:185:0x025e }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.nsm r25, defpackage.nlh r26) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsk.m(nsm, nlh):void");
    }

    public final void n(nsm nsmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "PAUSE");
            jSONObject.put("mediaSessionId", h());
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA);
        this.j.a(jA, nsmVar);
    }

    public final void o(nsm nsmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "PLAY");
            jSONObject.put("mediaSessionId", h());
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA);
        this.k.a(jA, nsmVar);
    }

    public final void p(nsm nsmVar, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", h());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.h;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA);
        this.t.a(jA, new nsg(this, nsmVar, 0));
    }

    public final void q(nsm nsmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "GET_STATUS");
            nln nlnVar = this.e;
            if (nlnVar != null) {
                jSONObject.put("mediaSessionId", nlnVar.b);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA);
        this.p.a(jA, nsmVar);
    }

    public final void r(nsm nsmVar, nlm nlmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long j = nlmVar.a;
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", h());
            jSONObject.put("currentTime", nrv.a(j));
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA);
        this.f = Long.valueOf(j);
        this.m.a(jA, new nsg(this, nsmVar, 1));
    }
}
