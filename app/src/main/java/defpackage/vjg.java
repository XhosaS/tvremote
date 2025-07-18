package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjg {
    public final Set a;
    private final Context b;
    private final zyg c;
    private final vqi d;
    private boolean e = false;

    public vjg(Context context, Set set, zyg zygVar, vqi vqiVar) {
        this.b = context;
        this.a = set;
        this.c = zygVar;
        this.d = vqiVar;
    }

    final zyd a() {
        zyd zydVarL = zxn.l(wyo.b(new zvh() { // from class: vjf
            @Override // defpackage.zvh
            public final zyd a() {
                ArrayList arrayList = new ArrayList(1);
                Iterator it = this.a.a.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((vkm) it.next()).a.d());
                    } catch (Exception e) {
                        arrayList.add(zxn.g(e));
                    }
                }
                return zxn.c(arrayList).a(new zvk(), zwk.a);
            }
        }), this.c);
        this.d.e(zydVarL, wzg.b());
        return zydVarL;
    }

    public final synchronized void b() {
        if (this.e) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_CHANGED");
        this.b.registerReceiver(new vje(), intentFilter);
        this.e = true;
    }

    final synchronized boolean c() {
        return this.e;
    }
}
