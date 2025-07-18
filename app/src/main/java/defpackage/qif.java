package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qif implements qgw {
    public final uio a;
    public final qil b;
    private final Context e;
    private final Executor f;
    private final ueg g;
    private final ujq h;
    private final ltg j;
    private final mcw k;
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final String i = "OneGoogle";

    public qif(Context context, Executor executor, ueg uegVar, ujq ujqVar, qil qilVar, mcw mcwVar, uio uioVar, ltg ltgVar) {
        this.e = context;
        this.f = executor;
        this.g = uegVar;
        this.h = ujqVar;
        this.b = qilVar;
        this.k = mcwVar;
        this.a = uioVar;
        this.j = ltgVar;
    }

    @Override // defpackage.qgw
    public final qgv a(Account account) {
        qgv qgvVar;
        synchronized (this.c) {
            Map map = this.d;
            if (!map.containsKey(account)) {
                Context context = this.e;
                int i = uem.b;
                uel uelVar = new uel(context);
                uelVar.a = "com.google.android.gms";
                uem.a("managed");
                uelVar.b = "managed";
                uem.b("mdisync");
                uelVar.c = "mdisync";
                ueh.b(account);
                uelVar.d = account;
                uelVar.b("profilesync/public/profile_info.pb");
                Uri uriA = uelVar.a();
                ujq ujqVar = this.h;
                ujl ujlVarH = ujm.h();
                ((uia) ujlVarH).c = new uic(this.a);
                ujlVarH.d(qij.a);
                ujlVarH.e(uriA);
                qgp qgpVar = new qgp(ujqVar.a(ujlVarH.a()));
                qio qioVar = new qio(this.f, this.g);
                final AtomicReference atomicReference = new AtomicReference(new qip() { // from class: qhz
                    @Override // defpackage.qip
                    public final void j() {
                    }
                });
                final AtomicReference atomicReference2 = new AtomicReference(new qiq() { // from class: qia
                    @Override // defpackage.qiq
                    public final void k() {
                    }
                });
                qiv qivVar = new qiv(context, new kqo(context, new kqc(account, ztv.a)), account, new yrp() { // from class: qib
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return (qip) atomicReference.get();
                    }
                }, new yrp() { // from class: qic
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return (qiq) atomicReference2.get();
                    }
                });
                account = account;
                if (aevz.a.eV().b(context)) {
                    new qgo(context.getApplicationContext().getPackageName());
                    zyd zydVarA = otn.a(this.j.a());
                    yqi yqiVar = new yqi() { // from class: qhy
                        @Override // defpackage.yqi
                        public final Object apply(Object obj) {
                            String str;
                            PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) obj;
                            return (pseudonymousIdToken == null || (str = pseudonymousIdToken.a) == null) ? "" : str;
                        }
                    };
                    zwk zwkVar = zwk.a;
                    yqt.i(zuz.g(zuz.g(zydVarA, yqiVar, zwkVar), new yqi() { // from class: pga
                        @Override // defpackage.yqi
                        public final Object apply(Object obj) {
                            return new pfz();
                        }
                    }, zwkVar));
                } else {
                    new qgo(context.getApplicationContext().getPackageName());
                    account.toString();
                    yqt.i(new pfz());
                }
                final qil qilVar = this.b;
                yrp yrpVar = new yrp() { // from class: qhx
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return new qik(qilVar.a);
                    }
                };
                new pfy();
                new qgo(context.getApplicationContext().getPackageName());
                new qim(yrpVar);
                qhw qhwVar = new qhw(qivVar, context, qioVar, qgpVar, new qid(this, uriA));
                qhwVar.e(new qie(this, uriA), zwk.a);
                atomicReference.set(qhwVar);
                atomicReference2.set(qhwVar);
                map.put(account, qhwVar);
            }
            qgvVar = (qgv) map.get(account);
        }
        return qgvVar;
    }
}
