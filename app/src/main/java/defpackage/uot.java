package defpackage;

import android.database.SQLException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uot {
    public final upv a;

    public uot(upv upvVar) {
        this.a = upvVar;
    }

    public final zwc a(final uqg uqgVar) {
        return this.a.c().e(wyo.d(new zvv() { // from class: uop
            @Override // defpackage.zvv
            public final zwc a(zvz zvzVar, Object obj) {
                upe upeVar = (upe) obj;
                upeVar.b();
                uqg uqgVar2 = uqgVar;
                upa upaVar = new upa(upeVar, uqgVar2.b, uqgVar2.a);
                int i = upy.a;
                upw upwVar = new upw(upaVar);
                upwVar.e(upeVar.b);
                return zwc.b(upwVar, zwk.a);
            }
        }), zwk.a);
    }

    public final zyd b(final uqg uqgVar) {
        return this.a.c().e(wyo.d(new zvv() { // from class: uoq
            @Override // defpackage.zvv
            public final zwc a(zvz zvzVar, Object obj) {
                uqg uqgVar2 = uqgVar;
                final upe upeVar = (upe) obj;
                final String str = uqgVar2.a;
                wvx wvxVarF = wzg.f("ExecSQL: ".concat(str), wwb.a, true);
                final Object[] objArr = uqgVar2.b;
                try {
                    final Callable callable = new Callable() { // from class: uow
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SQLException {
                            upeVar.a.execSQL(str, objArr);
                            return null;
                        }
                    };
                    upeVar.b();
                    zye zyeVar = new zye(wyo.i(new Callable() { // from class: uox
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            upe upeVar2 = upeVar;
                            upeVar2.d.b();
                            try {
                                return callable.call();
                            } finally {
                                upeVar2.d.a();
                            }
                        }
                    }));
                    upeVar.b.execute(zyeVar);
                    wvxVarF.a(zyeVar);
                    wvxVarF.close();
                    return new zwc(zyeVar);
                } catch (Throwable th) {
                    try {
                        wvxVarF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), zwk.a).f();
    }

    public final zyd c(final uqj uqjVar) {
        return this.a.c().e(wyo.d(new zvv() { // from class: uor
            @Override // defpackage.zvv
            public final zwc a(zvz zvzVar, Object obj) {
                return new zwc(((upe) obj).a(uqjVar));
            }
        }), zwk.a).f();
    }
}
