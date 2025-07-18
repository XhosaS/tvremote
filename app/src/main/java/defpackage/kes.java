package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kes implements kew {
    public final Context b;
    public final String c;
    public final kly d;
    public final kei e;
    public final kee f;
    public final kfq g;
    public final Looper h;
    public final int i;
    public final kev j;
    protected final kgu k;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kes(android.content.Context r8, android.app.Activity r9, defpackage.kei r10, defpackage.kee r11, defpackage.ker r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kes.<init>(android.content.Context, android.app.Activity, kei, kee, ker):void");
    }

    @Override // defpackage.kew
    public final kfq e() {
        return this.g;
    }

    public final kjb f() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        kjb kjbVar = new kjb();
        kee keeVar = this.f;
        boolean z = keeVar instanceof kec;
        Account accountA = null;
        if (z && (googleSignInAccountA2 = ((kec) keeVar).a()) != null) {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                accountA = new Account(str, "com.google");
            }
        } else if (keeVar instanceof keb) {
            accountA = ((keb) keeVar).a();
        }
        kjbVar.a = accountA;
        Set setA = (!z || (googleSignInAccountA = ((kec) keeVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (kjbVar.b == null) {
            kjbVar.b = new wg(0);
        }
        kjbVar.b.addAll(setA);
        Context context = this.b;
        kjbVar.d = context.getClass().getName();
        kjbVar.c = context.getPackageName();
        return kjbVar;
    }

    public final lvf g(int i, kic kicVar) {
        lvj lvjVar = new lvj();
        int i2 = kicVar.d;
        kgu kguVar = this.k;
        kguVar.d(lvjVar, i2, this);
        kfm kfmVar = new kfm(i, kicVar, lvjVar);
        Handler handler = kguVar.o;
        handler.sendMessage(handler.obtainMessage(4, new khn(kfmVar, kguVar.k.get(), this)));
        return lvjVar.a;
    }

    public final lvf h(khu khuVar) {
        kho khoVar = khuVar.a;
        kkk.l(khoVar.a.b, "Listener has already been released.");
        lvj lvjVar = new lvj();
        int i = khoVar.d;
        kgu kguVar = this.k;
        kguVar.d(lvjVar, i, this);
        kfl kflVar = new kfl(new khp(khoVar, khuVar.b, khuVar.c), lvjVar);
        Handler handler = kguVar.o;
        handler.sendMessage(handler.obtainMessage(8, new khn(kflVar, kguVar.k.get(), this)));
        return lvjVar.a;
    }

    public final lvf i(khg khgVar, int i) {
        lvj lvjVar = new lvj();
        kgu kguVar = this.k;
        kguVar.d(lvjVar, i, this);
        kfn kfnVar = new kfn(khgVar, lvjVar);
        Handler handler = kguVar.o;
        handler.sendMessage(handler.obtainMessage(13, new khn(kfnVar, kguVar.k.get(), this)));
        return lvjVar.a;
    }

    public final void j(int i, kfu kfuVar) {
        boolean z = true;
        if (!kfuVar.i && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        kfuVar.i = z;
        kgu kguVar = this.k;
        khn khnVar = new khn(new kfk(i, kfuVar), kguVar.k.get(), this);
        Handler handler = kguVar.o;
        handler.sendMessage(handler.obtainMessage(4, khnVar));
    }
}
