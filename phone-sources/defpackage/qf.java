package defpackage;

import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.FileObserver;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qf extends yiz implements yjz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(AccountManagerFuture accountManagerFuture, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = accountManagerFuture;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((qf) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((qf) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((qf) create((fki) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 17:
                return ((qf) create((ixz) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 18:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 19:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((qf) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.accounts.AccountManagerFuture, java.lang.Object] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.b) {
            case 0:
                return new qf((qg) this.a, yihVar, 0);
            case 1:
                return new qf((qg) this.a, yihVar, 1, (byte[]) null);
            case 2:
                return new qf((uz) this.a, yihVar, 2);
            case 3:
                return new qf((uz) this.a, yihVar, 3, (byte[]) null);
            case 4:
                return new qf((uz) this.a, yihVar, 4, (char[]) null);
            case 5:
                return new qf((uz) this.a, yihVar, 5, (short[]) null);
            case 6:
                return new qf((uz) this.a, yihVar, 6, (int[]) null);
            case 7:
                return new qf((uz) this.a, yihVar, 7, (boolean[]) null);
            case 8:
                return new qf((uz) this.a, yihVar, 8, (float[]) null);
            case 9:
                return new qf((uz) this.a, yihVar, 9, (byte[][]) null);
            case 10:
                return new qf((cnu) this.a, yihVar, 10);
            case 11:
                return new qf((gaw) this.a, yihVar, 11);
            case 12:
                return new qf((gaw) this.a, yihVar, 12, (byte[]) null);
            case 13:
                return new qf((guw) this.a, yihVar, 13);
            case 14:
                return new qf((gyb) this.a, yihVar, 14);
            case 15:
                return new qf((Context) this.a, yihVar, 15);
            case 16:
                return new qf((ihq) this.a, yihVar, 16);
            case 17:
                return new qf((iye) this.a, yihVar, 17);
            case 18:
                return new qf((isy) this.a, yihVar, 18);
            case 19:
                return new qf((mdw) this.a, yihVar, 19);
            default:
                return new qf((AccountManagerFuture) this.a, yihVar, 20);
        }
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [ids, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v69, types: [java.lang.Object, qsa] */
    /* JADX WARN: Type inference failed for: r9v74, types: [android.accounts.AccountManagerFuture, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws IOException {
        FileObserver fileObserver = null;
        switch (this.b) {
            case 0:
                ybn.f(obj);
                Object obj2 = this.a;
                qg qgVar = (qg) obj2;
                wn wnVar = qgVar.e;
                if (wnVar != null) {
                    wo woVar = new wo(wnVar);
                    kw kwVar = qgVar.i;
                    if (kwVar != null) {
                        ykr.q(((bko) obj2).F(), null, 0, new qd(kwVar, woVar, (yih) null, 0), 3);
                    }
                    qgVar.e = null;
                }
                return ygi.a;
            case 1:
                ybn.f(obj);
                Object obj3 = this.a;
                qg qgVar2 = (qg) obj3;
                if (qgVar2.e == null) {
                    wn wnVar2 = new wn();
                    kw kwVar2 = qgVar2.i;
                    if (kwVar2 != null) {
                        ykr.q(((bko) obj3).F(), null, 0, new qd(kwVar2, wnVar2, (yih) null, 1), 3);
                    }
                    qgVar2.e = wnVar2;
                }
                return ygi.a;
            case 2:
                ybn.f(obj);
                ((uz) this.a).p();
                return ygi.a;
            case 3:
                ybn.f(obj);
                ((uz) this.a).q();
                return ygi.a;
            case 4:
                ybn.f(obj);
                ((uz) this.a).q();
                return ygi.a;
            case 5:
                ybn.f(obj);
                ((uz) this.a).p();
                return ygi.a;
            case 6:
                ybn.f(obj);
                ((uz) this.a).q();
                return ygi.a;
            case 7:
                ybn.f(obj);
                ((uz) this.a).q();
                return ygi.a;
            case 8:
                ybn.f(obj);
                ((uz) this.a).p();
                return ygi.a;
            case 9:
                ybn.f(obj);
                ((uz) this.a).q();
                return ygi.a;
            case 10:
                ybn.f(obj);
                ((cnu) this.a).show();
                return ygi.a;
            case 11:
                ybn.f(obj);
                gaw gawVar = (gaw) this.a;
                gawVar.i.b(new Integer(gawVar.g));
                return ygi.a;
            case 12:
                ybn.f(obj);
                gaw gawVar2 = (gaw) this.a;
                gawVar2.h.b(new Integer(gawVar2.f));
                return ygi.a;
            case 13:
                ybn.f(obj);
                String str = gwf.a;
                gpn.b();
                Objects.toString(this.a);
                return ygi.a;
            case 14:
                ybn.f(obj);
                Object obj4 = this.a;
                synchronized (obj4) {
                    if (!((gyb) obj4).d || ((gyb) obj4).e) {
                        return ygi.a;
                    }
                    try {
                        ((gyb) obj4).e();
                    } catch (IOException unused) {
                        ((gyb) obj4).f = true;
                    }
                    try {
                        if (((gyb) obj4).g()) {
                            ((gyb) obj4).f();
                        }
                    } catch (IOException unused2) {
                        ((gyb) obj4).g = true;
                        ((gyb) obj4).b = new zhg(new zgj());
                    }
                    return ygi.a;
                }
            case 15:
                ybn.f(obj);
                Intent intent = new Intent();
                Context context = (Context) this.a;
                context.startActivity(jbr.T(context, intent));
                return ygi.a;
            case 16:
                ybn.f(obj);
                Object obj5 = this.a;
                try {
                    File file = new File(((ihq) obj5).d.getCacheDir(), "clear_cache_file_name.tmp");
                    file.createNewFile();
                    krd.f("Observing cache file clear_cache_file_name.tmp");
                    ((ihq) obj5).e = new ihn((ihq) obj5, file.getPath());
                    FileObserver fileObserver2 = ((ihq) obj5).e;
                    if (fileObserver2 == null) {
                        yks.c("fileObserver");
                    } else {
                        fileObserver = fileObserver2;
                    }
                    fileObserver.startWatching();
                } catch (Exception e) {
                    e.toString();
                    krd.c("Encountered exception when writing temp cache file ".concat(e.toString()));
                }
                return ygi.a;
            case 17:
                ybn.f(obj);
                ((iye) this.a).d();
                return ygi.a;
            case 18:
                ybn.f(obj);
                try {
                    Object obj6 = this.a;
                    krd.b("Registered user account with result " + ((isy) obj6).c.a(((ksn) ((ldy) ((isy) obj6).d).a().g()).a));
                } catch (Exception e2) {
                    e2.toString();
                    krd.c("Encountered error when registering account: ".concat(e2.toString()));
                }
                return ygi.a;
            case 19:
                ybn.f(obj);
                Object obj7 = this.a;
                ((mdw) obj7).e.ea(new itm(obj7, 10));
                return ygi.a;
            default:
                ybn.f(obj);
                return this.a.getResult();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(Context context, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(cnu cnuVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = cnuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(gaw gawVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = gawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(gaw gawVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
        this.a = gawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(guw guwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = guwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(gyb gybVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = gybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(ihq ihqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = ihqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(isy isyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = isyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(iye iyeVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = iyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(mdw mdwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = mdwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(qg qgVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = qgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(qg qgVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
        this.a = qgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i, float[] fArr) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i, int[] iArr) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i, short[] sArr) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i, boolean[] zArr) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(uz uzVar, yih yihVar, int i, byte[][] bArr) {
        super(2, yihVar);
        this.b = i;
        this.a = uzVar;
    }
}
