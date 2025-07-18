package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nex implements Handler.Callback, ekm, eli {
    public final elj c;
    public boolean d;
    private final Context e;
    private final String f;
    private final nfd g;
    private final nfb h;
    private final ney i;
    private boolean j;
    private boolean n;
    public final ko b = new ko();
    private int k = 1;
    private int l = 0;
    private eai m = eai.a;
    private long q = -1;
    private int p = -1;
    private int o = -1;
    public final Handler a = edt.M(this);

    public nex(Context context, String str, nfd nfdVar, nfb nfbVar, ney neyVar, elj eljVar) {
        this.e = context.getApplicationContext();
        this.f = str;
        this.g = nfdVar;
        this.h = nfbVar;
        this.i = neyVar;
        this.c = eljVar;
        ((elg) eljVar).d = this;
    }

    private final void aA() {
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            if (((nfa) jzsVar.b).d > 1000) {
                ay(jzsVar, false);
            }
            i++;
        }
    }

    private final void az(ekl eklVar) {
        if (this.d) {
            return;
        }
        this.c.f(eklVar);
    }

    @Override // defpackage.ekm
    public final void D(ekl eklVar, boolean z) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                this.n = z;
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.v(eklVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void E(ekl eklVar, int i, int i2) {
        az(eklVar);
        int i3 = 0;
        while (true) {
            ko koVar = this.b;
            if (i3 >= koVar.d) {
                this.o = i;
                this.p = i2;
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i3);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.o(eklVar, i, i2, zI);
            }
            i3++;
        }
    }

    @Override // defpackage.ekm
    public final void F(ekl eklVar, int i) {
        if (!this.d) {
            this.c.h(eklVar);
        }
        int i2 = 0;
        while (true) {
            ko koVar = this.b;
            if (i2 >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i2);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.w(eklVar, zI);
            }
            i2++;
        }
    }

    @Override // defpackage.ekm
    public final void G(ekl eklVar, ebh ebhVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.p(eklVar, ebhVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void H(ekl eklVar, evv evvVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.x(eklVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void K(ekl eklVar, long j, int i) {
        az(eklVar);
        int i2 = 0;
        while (true) {
            ko koVar = this.b;
            if (i2 >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i2);
            this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.y(eklVar, j, i);
            }
            i2++;
        }
    }

    @Override // defpackage.ekm
    public final void ap(ekl eklVar, dze dzeVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.q(dzeVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void aq(ekl eklVar, int i) {
        az(eklVar);
        int i2 = 0;
        while (true) {
            ko koVar = this.b;
            if (i2 >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i2);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.r(eklVar, i, zI);
            }
            i2++;
        }
    }

    @Override // defpackage.ekm
    public final void ar(ekl eklVar, evq evqVar, evv evvVar, IOException iOException) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            boolean zI = this.c.i(eklVar, (String) ((jzs) koVar.g(i)).c);
            for (nez nezVar : (nez[]) ((jzs) koVar.g(i)).a) {
                nezVar.t(eklVar, evqVar, evvVar, iOException, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void as(ekl eklVar, dze dzeVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.z(dzeVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.eli
    public final void au(ekl eklVar, String str, String str2) {
        ko koVar = this.b;
        jzs jzsVar = (jzs) koVar.get(str);
        jzs jzsVar2 = (jzs) koVar.get(str2);
        if (jzsVar == null || jzsVar2 == null) {
            return;
        }
        for (nez nezVar : (nez[]) jzsVar.a) {
            nezVar.c(eklVar, str2);
        }
    }

    @Override // defpackage.eli
    public final void av(ekl eklVar, String str) {
        jzs jzsVar = (jzs) this.b.get(str);
        if (jzsVar != null) {
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.a(eklVar);
            }
        }
    }

    @Override // defpackage.eli
    public final void aw(ekl eklVar, String str) {
        ekl eklVar2;
        evz evzVar = eklVar.d;
        int i = evzVar != null ? evzVar.b : -1;
        nfb nfbVar = this.h;
        eay eayVar = eklVar.b;
        String str2 = this.f;
        long j = eklVar.a;
        nfc nfcVarA = nfbVar.a(eayVar, i);
        nfa nfaVar = new nfa(str2, str, j);
        nez[] nezVarArrA = this.i.a(this.e, nfcVarA);
        for (nez nezVar : nezVarArrA) {
            nezVar.b = nfaVar;
            nezVar.i();
        }
        jzs jzsVar = new jzs(str, nfaVar, nezVarArrA);
        this.b.put(str, jzsVar);
        int length = nezVarArrA.length;
        int i2 = 0;
        while (i2 < length) {
            nez nezVar2 = nezVarArrA[i2];
            int i3 = this.k;
            if (i3 != 1 && i3 != 4) {
                nezVar2.m(eklVar, this.j, i3, true);
            }
            int i4 = this.l;
            if (i4 != 0) {
                nezVar2.k(eklVar, i4, true);
            }
            if (!this.m.equals(eai.a)) {
                nezVar2.j(eklVar, this.m, true);
            }
            if (this.n) {
                nezVar2.v(eklVar, true);
            }
            int i5 = this.o;
            if (i5 != -1) {
                nezVar2.o(eklVar, i5, this.p, true);
            }
            long j2 = this.q;
            if (j2 != -1) {
                eklVar2 = eklVar;
                nezVar2.e(eklVar2, 0, 0L, j2, true);
            } else {
                eklVar2 = eklVar;
            }
            i2++;
            eklVar = eklVar2;
        }
        Handler handler = this.a;
        handler.sendMessageDelayed(Message.obtain(handler, 0, jzsVar), 600000L);
    }

    @Override // defpackage.eli
    public final void ax(ekl eklVar, String str, boolean z) {
        jzs jzsVar = (jzs) this.b.remove(str);
        if (jzsVar != null) {
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.h(eklVar.a, z);
            }
            ay(jzsVar, true);
        }
    }

    public final void ay(jzs jzsVar, boolean z) {
        nfa nfaVar = (nfa) jzsVar.b;
        StringBuilder sb = nfaVar.c;
        sb.setLength(0);
        sb.append(nfaVar.a);
        for (Map.Entry entry : nfaVar.b.entrySet()) {
            sb.append('&');
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((CharSequence) entry.getValue());
        }
        this.g.a(Uri.parse(sb.toString()), (String) jzsVar.c, z);
        Handler handler = this.a;
        handler.removeMessages(0, jzsVar);
        if (z) {
            return;
        }
        for (nez nezVar : (nez[]) jzsVar.a) {
            nezVar.b();
        }
        handler.sendMessageDelayed(Message.obtain(handler, 0, jzsVar), 600000L);
    }

    @Override // defpackage.ekm
    public final void g(ekl eklVar, int i, long j, long j2) {
        az(eklVar);
        int i2 = 0;
        while (true) {
            ko koVar = this.b;
            if (i2 >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i2);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.d(eklVar, i, j, j2, zI);
            }
            i2++;
        }
    }

    @Override // defpackage.ekm
    public final void h(ekl eklVar, int i, long j, long j2) {
        az(eklVar);
        int i2 = 0;
        while (true) {
            ko koVar = this.b;
            if (i2 >= koVar.d) {
                this.q = j2;
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i2);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.e(eklVar, i, j, j2, zI);
            }
            i2++;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ay((jzs) message.obj, false);
        return true;
    }

    @Override // defpackage.ekm
    public final void i(ekl eklVar, evv evvVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.f(eklVar, evvVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void n(ekl eklVar, Exception exc) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.g(eklVar, exc, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void p(ekl eklVar, boolean z) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.s(eklVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void r(ekl eklVar, evq evqVar, evv evvVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.u(eklVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void u(ekl eklVar, eai eaiVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                this.m = eaiVar;
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.j(eklVar, eaiVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void w(ekl eklVar, int i) {
        az(eklVar);
        int i2 = 0;
        while (true) {
            ko koVar = this.b;
            if (i2 >= koVar.d) {
                this.l = i;
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i2);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.k(eklVar, i, zI);
            }
            i2++;
        }
    }

    @Override // defpackage.ekm
    public final void x(ekl eklVar, eah eahVar) {
        az(eklVar);
        int i = 0;
        while (true) {
            ko koVar = this.b;
            if (i >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.l(eklVar, eahVar, zI);
            }
            i++;
        }
    }

    @Override // defpackage.ekm
    public final void y(ekl eklVar, boolean z, int i) {
        ko koVar;
        az(eklVar);
        int i2 = 0;
        while (true) {
            koVar = this.b;
            if (i2 >= koVar.d) {
                break;
            }
            jzs jzsVar = (jzs) koVar.g(i2);
            boolean zI = this.c.i(eklVar, (String) jzsVar.c);
            for (nez nezVar : (nez[]) jzsVar.a) {
                nezVar.m(eklVar, z, i, zI);
            }
            i2++;
        }
        this.j = z;
        this.k = i;
        if (i != 4 && i != 1) {
            aA();
            return;
        }
        for (int i3 = 0; i3 < koVar.d; i3++) {
            ay((jzs) koVar.g(i3), false);
        }
    }

    @Override // defpackage.ekm
    public final void z(ekl eklVar, ean eanVar, ean eanVar2, int i) {
        int i2;
        elj eljVar = this.c;
        String strC = eljVar.c();
        if (this.d) {
            i2 = i;
        } else {
            i2 = i;
            eljVar.g(eklVar, i2);
        }
        int i3 = 0;
        while (true) {
            ko koVar = this.b;
            if (i3 >= koVar.d) {
                aA();
                return;
            }
            jzs jzsVar = (jzs) koVar.g(i3);
            String str = (String) jzsVar.c;
            boolean zEquals = str.equals(strC);
            boolean zI = eljVar.i(eklVar, str);
            nez[] nezVarArr = (nez[]) jzsVar.a;
            int length = nezVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                nezVarArr[i4].n(eklVar, eanVar, eanVar2, i2, zEquals, zI);
                i4++;
                i2 = i;
            }
            i3++;
            i2 = i;
        }
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void N() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void O() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void S() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void T() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Z() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ae() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Q(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void R(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void an(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void j(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void k(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void l(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void o(ekl eklVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void B(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void C(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void I(ekl eklVar, String str) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void J(ekl eklVar, ehw ehwVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void L(ekl eklVar, ebo eboVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void M(ekl eklVar, float f) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void Y(evq evqVar, evv evvVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void a(ekl eklVar, dyo dyoVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ab(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ah(ekl eklVar, Object obj) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void ao(int i, int i2) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void at(eao eaoVar, dwi dwiVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void b(ekl eklVar, String str) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void c(ekl eklVar, long j) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void d(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void e(ekl eklVar, elt eltVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void f(ekl eklVar, elt eltVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void m(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void q(ekl eklVar, boolean z) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void s(ekl eklVar, ead eadVar) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void v(ekl eklVar, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void P(ekl eklVar, String str, long j) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void am(ekl eklVar, String str, long j) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void t(ekl eklVar, boolean z, int i) {
    }

    @Override // defpackage.ekm
    public final /* synthetic */ void A(ekl eklVar, int i, int i2, boolean z) {
    }
}
