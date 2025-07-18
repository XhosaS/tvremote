package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmz implements qlz {
    private final qgw a;
    private final qlo b;
    private final qgt c = new qmx(this);
    private final List d = new ArrayList();
    private final qnk e;
    private final qnh f;
    private final qmq g;

    public qmz(Context context, qgw qgwVar, qlo qloVar, yqt yqtVar) {
        context.getClass();
        qgwVar.getClass();
        this.a = qgwVar;
        this.b = qloVar;
        this.g = new qmq(context, qloVar, new OnAccountsUpdateListener() { // from class: qmr
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                qmz qmzVar = this.a;
                qmzVar.i();
                for (Account account : accountArr) {
                    qmzVar.h(account);
                }
            }
        });
        this.e = new qnk(context, qgwVar, qloVar, yqtVar);
        this.f = new qnh(qgwVar, context);
    }

    public static zyd g(zyd zydVar) {
        yqi yqiVar = new yqi() { // from class: qms
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((yqt) obj).f();
            }
        };
        return zuz.g(zydVar, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.qlz
    public final zyd a() {
        return this.e.a(new yqi() { // from class: qmu
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return qmz.g(((qgv) obj).a());
            }
        });
    }

    @Override // defpackage.qlz
    public final zyd b() {
        return this.e.a(new yqi() { // from class: qmv
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((qgv) obj).c();
            }
        });
    }

    @Override // defpackage.qlz
    public final void c(qly qlyVar) {
        List list = this.d;
        synchronized (list) {
            if (list.isEmpty()) {
                qmq qmqVar = this.g;
                synchronized (qmqVar) {
                    if (!qmqVar.a) {
                        qmqVar.c.addOnAccountsUpdatedListener(qmqVar.b, null, false, new String[]{"com.google"});
                        qmqVar.a = true;
                    }
                }
                zyd zydVarA = this.b.a();
                qmy qmyVar = new qmy(this);
                zxn.p(zydVarA, wyo.f(qmyVar), zwk.a);
            }
            list.add(qlyVar);
        }
    }

    @Override // defpackage.qlz
    public final void d(qly qlyVar) {
        List list = this.d;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(qlyVar);
            if (list.isEmpty()) {
                qmq qmqVar = this.g;
                synchronized (qmqVar) {
                    if (qmqVar.a) {
                        try {
                            qmqVar.c.removeOnAccountsUpdatedListener(qmqVar.b);
                        } catch (IllegalArgumentException e) {
                            Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                        }
                        qmqVar.a = false;
                    }
                }
            }
        }
    }

    @Override // defpackage.qlz
    public final zyd e(String str, int i) {
        return this.f.a(new qng() { // from class: qmt
            @Override // defpackage.qng
            public final zyd a(qgv qgvVar, qgu qguVar, int i2) {
                return qmz.g(qgvVar.b(qguVar, i2));
            }
        }, str, i);
    }

    @Override // defpackage.qlz
    public final zyd f(String str, int i) {
        return this.f.a(new qng() { // from class: qmw
            @Override // defpackage.qng
            public final zyd a(qgv qgvVar, qgu qguVar, int i2) {
                return qgvVar.d(qguVar, i2);
            }
        }, str, i);
    }

    public final void h(Account account) {
        qgv qgvVarA = this.a.a(account);
        qgt qgtVar = this.c;
        qgvVarA.f(qgtVar);
        qgvVarA.e(qgtVar, zwk.a);
    }

    public final void i() {
        List list = this.d;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((qly) it.next()).a();
            }
        }
    }
}
