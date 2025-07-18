package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hud implements huc {
    hty a;
    private final Context b;
    private final exl c;
    private final PackageManager d;
    private final ghr e;
    private final htw f;

    public hud(Context context, exl exlVar, htw htwVar, PackageManager packageManager, ghr ghrVar) {
        this.b = context;
        this.c = exlVar;
        this.f = htwVar;
        this.d = packageManager;
        this.e = ghrVar;
    }

    private static abow c(aboe aboeVar) {
        abxc abxcVar = abpa.b;
        MessageLite messageLite = abxcVar.a;
        aboe aboeVar2 = aboe.a;
        if (messageLite != aboeVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = aboeVar.n;
        abxb abxbVar = abxcVar.d;
        if (!abwrVar.n(abxbVar)) {
            return null;
        }
        if (messageLite != aboeVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK = aboeVar.n.k(abxbVar);
        abpa abpaVar = (abpa) (objK == null ? abxcVar.b : abxcVar.b(objK));
        if (abpaVar.c.size() == 0) {
            return null;
        }
        abou abouVar = (abou) abpaVar.c.get(0);
        abxc abxcVar2 = abow.b;
        MessageLite messageLite2 = abxcVar2.a;
        abou abouVar2 = abou.a;
        if (messageLite2 != abouVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar2 = abouVar.n;
        abxb abxbVar2 = abxcVar2.d;
        if (!abwrVar2.n(abxbVar2)) {
            return null;
        }
        if (messageLite2 != abouVar2) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        Object objK2 = abouVar.n.k(abxbVar2);
        return (abow) (objK2 == null ? abxcVar2.b : abxcVar2.b(objK2));
    }

    private final void d(aboe aboeVar) {
        abog abogVar = aboeVar.c;
        if (abogVar == null) {
            abogVar = abog.a;
        }
        int iA = aboc.a(abogVar.b);
        if (iA != 0 && iA == 4) {
            this.e.A(zpg.OPA_TV_VOICE_ACTION_OPEN_APP);
            return;
        }
        abog abogVar2 = aboeVar.c;
        if (abogVar2 == null) {
            abogVar2 = abog.a;
        }
        int iA2 = aboc.a(abogVar2.b);
        if (iA2 == 0 || iA2 != 97) {
            this.e.A(zpg.OPA_TV_VOICE_ACTION_UNKNOWN);
            return;
        }
        if (this.f.a(c(aboeVar)) == 2) {
            this.e.A(zpg.OPA_TV_VOICE_ACTION_SWITCH_CHANNEL);
        } else {
            this.e.A(zpg.OPA_TV_VOICE_ACTION_SWITCH_INPUT);
        }
    }

    @Override // defpackage.huc
    public final void a() {
        this.a = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x0636, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0622 A[LOOP:0: B:11:0x0022->B:304:0x0622, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    @Override // defpackage.huc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.hkx r29) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hud.b(hkx):boolean");
    }
}
