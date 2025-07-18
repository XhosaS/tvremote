package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lgr extends lht {
    public final lal a;
    public final lal b;
    public final lal c;
    public final lal d;
    public final lal e;
    public final lal f;
    private final Map g;

    public lgr(lih lihVar) {
        super(lihVar);
        this.g = new HashMap();
        lbk lbkVar = this.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        laoVar.getClass();
        this.a = new lal(laoVar, "last_delete_stale", 0L);
        lbk lbkVar2 = this.y;
        lao laoVar2 = lbkVar2.e;
        lbkVar2.m(laoVar2);
        laoVar2.getClass();
        this.b = new lal(laoVar2, "last_delete_stale_batch", 0L);
        lbk lbkVar3 = this.y;
        lao laoVar3 = lbkVar3.e;
        lbkVar3.m(laoVar3);
        laoVar3.getClass();
        this.c = new lal(laoVar3, "backoff", 0L);
        lbk lbkVar4 = this.y;
        lao laoVar4 = lbkVar4.e;
        lbkVar4.m(laoVar4);
        laoVar4.getClass();
        this.d = new lal(laoVar4, "last_upload", 0L);
        lbk lbkVar5 = this.y;
        lao laoVar5 = lbkVar5.e;
        lbkVar5.m(laoVar5);
        laoVar5.getClass();
        this.e = new lal(laoVar5, "last_upload_attempt", 0L);
        lbk lbkVar6 = this.y;
        lao laoVar6 = lbkVar6.e;
        lbkVar6.m(laoVar6);
        laoVar6.getClass();
        this.f = new lal(laoVar6, "midnight_offset", 0L);
    }

    @Deprecated
    final Pair a(String str) {
        jvr jvrVarC;
        lgq lgqVar;
        g();
        lbk lbkVar = this.y;
        klk klkVar = lbkVar.B;
        Map map = this.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lgq lgqVar2 = (lgq) map.get(str);
        if (lgqVar2 != null && jElapsedRealtime < lgqVar2.c) {
            return new Pair(lgqVar2.a, Boolean.valueOf(lgqVar2.b));
        }
        long jM = lbkVar.d.m(str, kzg.b) + jElapsedRealtime;
        try {
            try {
                jvrVarC = jvs.c(lbkVar.a);
            } catch (PackageManager.NameNotFoundException unused) {
                jvrVarC = null;
                if (lgqVar2 != null && jElapsedRealtime < lgqVar2.c + this.y.d.m(str, kzg.c)) {
                    return new Pair(lgqVar2.a, Boolean.valueOf(lgqVar2.b));
                }
            }
        } catch (Exception e) {
            lbk lbkVar2 = this.y;
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.j.b("Unable to get advertising id", e);
            lgqVar = new lgq("", false, jM);
        }
        if (jvrVarC == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", false);
        }
        String str2 = jvrVarC.a;
        lgqVar = str2 != null ? new lgq(str2, jvrVarC.b, jM) : new lgq("", jvrVarC.b, jM);
        this.g.put(str, lgqVar);
        return new Pair(lgqVar.a, Boolean.valueOf(lgqVar.b));
    }

    final Pair d(String str, lct lctVar) {
        return lctVar.n(lcs.AD_STORAGE) ? a(str) : new Pair("", false);
    }

    @Deprecated
    final String e(String str, boolean z) throws NoSuchAlgorithmException {
        g();
        String str2 = z ? (String) a(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestE = lio.E();
        if (messageDigestE == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestE.digest(str2.getBytes())));
    }

    @Override // defpackage.lht
    protected final void b() {
    }
}
