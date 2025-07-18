package defpackage;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzq extends ksw {
    public int a;
    public String b;
    public final long c;
    public List d;
    public int e;
    public String f;
    private String g;
    private String h;
    private String i;
    private long j;
    private final long k;
    private String l;
    private String m;
    private String n;
    private long o;

    public kzq(lbk lbkVar, long j, long j2) {
        super(lbkVar);
        this.o = 0L;
        this.f = null;
        this.k = j;
        this.c = j2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:4)(17:77|6|(1:10)(2:11|(1:13))|81|14|(4:16|(1:18)(1:20)|83|21)|26|(2:28|(2:30|(2:32|(2:34|(2:36|(2:38|(1:40)(1:41))(1:42))(1:43))(1:44))(1:45))(1:46))(1:47)|48|79|49|(1:51)(1:52)|53|(1:55)|59|(2:62|(1:64)(4:65|(3:68|(1:86)(1:87)|66)|85|71))(1:71)|(2:73|74)(2:75|76))|5|26|(0)(0)|48|79|49|(0)(0)|53|(0)|59|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0178, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0179, code lost:
    
        r1 = r11.y;
        r5 = r1.f;
        r1.o(r5);
        r5.c.c("Fetching Google App Id failed with exception. appId", defpackage.lab.b(r3), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167 A[Catch: IllegalStateException -> 0x0178, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0178, blocks: (B:49:0x0153, B:53:0x0163, B:55:0x0167), top: B:79:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d9  */
    @Override // defpackage.ksw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void d() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzq.d():void");
    }

    @Override // defpackage.ksw
    protected final boolean f() {
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.AppMetadata, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.AppMetadata) from 0x0172: MOVE (r21v0 com.google.android.gms.measurement.internal.AppMetadata) = (r2v0 com.google.android.gms.measurement.internal.AppMetadata) (LINE:371)
          (r2v0 com.google.android.gms.measurement.internal.AppMetadata) from 0x0161: MOVE (r21v2 com.google.android.gms.measurement.internal.AppMetadata) = (r2v0 com.google.android.gms.measurement.internal.AppMetadata) (LINE:354)
          (r2v0 com.google.android.gms.measurement.internal.AppMetadata) from 0x0135: MOVE (r21v4 com.google.android.gms.measurement.internal.AppMetadata) = (r2v0 com.google.android.gms.measurement.internal.AppMetadata) (LINE:310)
          (r2v0 com.google.android.gms.measurement.internal.AppMetadata) from 0x00f5: MOVE (r21v7 com.google.android.gms.measurement.internal.AppMetadata) = (r2v0 com.google.android.gms.measurement.internal.AppMetadata) (LINE:246)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    final com.google.android.gms.measurement.internal.AppMetadata h(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzq.h(java.lang.String):com.google.android.gms.measurement.internal.AppMetadata");
    }

    final String i() {
        a();
        kkk.k(this.g);
        return this.g;
    }

    final String j() {
        g();
        a();
        kkk.k(this.m);
        return this.m;
    }

    final void k() {
        String str;
        g();
        lbk lbkVar = this.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        if (laoVar.f().n(lcs.ANALYTICS_STORAGE)) {
            lio lioVar = lbkVar.i;
            byte[] bArr = new byte[16];
            lbkVar.m(lioVar);
            lioVar.F().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.j.a("Analytics Storage consent is not granted");
            str = null;
        }
        lab labVar2 = lbkVar.f;
        lbkVar.o(labVar2);
        labVar2.j.a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.n = str;
        klk klkVar = lbkVar.B;
        this.o = System.currentTimeMillis();
    }
}
