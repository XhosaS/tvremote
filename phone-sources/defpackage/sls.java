package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class sls implements ufw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ sls(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, tsl] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, uhp] */
    @Override // defpackage.ufw
    public final uhp a(Object obj) throws Throwable {
        uhp uhpVar;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                slw slwVar = (slw) obj2;
                Uri uri = (Uri) sfy.J(slwVar.b);
                Uri uriB = sil.b(uri, ".tmp");
                try {
                    tql tqlVarJ = sss.j("Write " + ((slw) obj2).a);
                    try {
                        uri uriVar = new uri();
                        try {
                            aafi aafiVar = ((slw) obj2).l;
                            sks sksVar = new sks();
                            sksVar.a = new uri[]{uriVar};
                            OutputStream outputStream = (OutputStream) aafiVar.r(uriB, sksVar);
                            try {
                                ((vvj) obj).g(outputStream);
                                uriVar.d();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                tqlVarJ.close();
                                ((slw) obj2).l.t(uriB, uri);
                                synchronized (slwVar.f) {
                                    ((slw) obj2).g = obj;
                                }
                                return uhl.a;
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            throw sik.B(((slw) obj2).l, uri, e, ((slw) obj2).a);
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    aafi aafiVar2 = slwVar.l;
                    if (aafiVar2.u(uriB)) {
                        try {
                            aafiVar2.s(uriB);
                        } catch (IOException e3) {
                            e2.addSuppressed(e3);
                        }
                    }
                    throw e2;
                }
            case 1:
                return this.a;
            case 2:
                slz slzVar = (slz) this.a;
                slzVar.c((Uri) sfy.J(slzVar.a), obj);
                return uhl.a;
            case 3:
                slz slzVar2 = (slz) this.a;
                return sfy.C(slzVar2.b((Uri) sfy.J(slzVar2.a)));
            case 4:
                Uri uri2 = (Uri) obj;
                Uri uriB2 = sil.b(uri2, ".bak");
                try {
                    aafi aafiVar3 = ((slz) this.a).f;
                    if (aafiVar3.u(uriB2)) {
                        aafiVar3.t(uriB2, uri2);
                    }
                    return uhl.a;
                } catch (IOException e4) {
                    return sfy.B(e4);
                }
            case 5:
                Object obj3 = this.a;
                synchronized (((slz) obj3).d) {
                    uhpVar = ((slz) obj3).e;
                }
                return uhpVar;
            case 6:
                return sfy.C(this.a.apply(obj));
            case 7:
                return ((smc) this.a).c.c();
            case 8:
                return ((smc) this.a).b.i();
            default:
                Object obj4 = this.a;
                ((IOException) obj4).addSuppressed((IOException) obj);
                throw ((Throwable) obj4);
        }
    }
}
