package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nec extends eem implements efn {
    private static final Pattern a = Pattern.compile("(^|&)rn=[0-9]+");
    private final efn b;
    private final boolean c;
    private final int d;
    private long e;
    private Uri f;
    private eey g;
    private Uri h;
    private long i;
    private boolean j;
    private boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nec(efn efnVar, int i, boolean z) {
        super(true);
        AtomicInteger atomicInteger = ned.a;
        this.b = efnVar;
        this.d = i;
        this.c = z;
    }

    private final void k() {
        this.h = null;
        this.i = 0L;
        this.j = false;
    }

    private final void l() {
        this.h = null;
        this.i = 0L;
        boolean z = false;
        if (this.c && !this.j) {
            z = true;
        }
        this.j = z;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws efk {
        try {
            int i3 = this.d;
            if (i3 > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.e;
                if (jElapsedRealtime > i3) {
                    this.g.getClass();
                    throw new neb(jElapsedRealtime);
                }
            }
            int iA = this.b.a(bArr, i, i2);
            if (iA != -1) {
                g(iA);
            }
            return iA;
        } catch (efk e) {
            l();
            throw e;
        }
    }

    @Override // defpackage.ees
    public long b(eey eeyVar) throws efk {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.e = jElapsedRealtime;
        if (this.h != null && jElapsedRealtime - this.i > 600000) {
            k();
        }
        Uri uriBuild = eeyVar.a;
        if (!uriBuild.equals(this.f)) {
            k();
            this.f = uriBuild;
        }
        Uri uri = this.h;
        if (uri != null) {
            uriBuild = uri;
        } else if (this.j) {
            edb.g("Requesting alternate redirect");
            uriBuild = uriBuild.buildUpon().appendQueryParameter("cmo", "pf=1").build();
        }
        String encodedQuery = uriBuild.getEncodedQuery();
        String strCq = "rn=" + ned.a.getAndIncrement();
        if (encodedQuery != null) {
            Matcher matcher = a.matcher(encodedQuery);
            if (matcher.find()) {
                strCq = matcher.replaceFirst("$1".concat(strCq));
            } else if (!encodedQuery.isEmpty()) {
                strCq = a.cq(strCq, encodedQuery, "&");
            }
        }
        eey eeyVarC = eeyVar.c(uriBuild.buildUpon().encodedQuery(strCq).build());
        i(eeyVarC);
        this.g = eeyVarC;
        try {
            efn efnVar = this.b;
            long jB = efnVar.b(eeyVarC);
            if (this.h == null) {
                this.h = efnVar.c();
                this.i = SystemClock.elapsedRealtime();
            }
            j(eeyVarC);
            this.k = true;
            return jB;
        } catch (efk e) {
            l();
            throw e;
        }
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.b.c();
    }

    @Override // defpackage.ees
    public final void d() {
        try {
            try {
                this.b.d();
                if (this.k) {
                    h();
                    this.k = false;
                }
            } catch (efk e) {
                l();
                throw e;
            }
        } catch (Throwable th) {
            if (this.k) {
                h();
                this.k = false;
            }
            throw th;
        }
    }

    @Override // defpackage.eem, defpackage.ees
    public final Map e() {
        return this.b.e();
    }
}
