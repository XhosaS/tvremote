package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usb implements utj {
    static final xsj a;
    static final xsj b;
    private final usa c;
    private ImmutableList d;
    private int e;
    private final usc f;

    static {
        String strAb = sij.ab(upz.c.a());
        xsg xsgVar = xsm.b;
        int i = xsj.c;
        a = new xsf(strAb, xsgVar);
        b = new xsf(sij.ab(uqa.d.a()), xsm.b);
    }

    public usb(usa usaVar) {
        this.c = usaVar;
        this.f = usaVar.b;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return utv.a;
    }

    @Override // defpackage.utj
    public final void e(upq upqVar) {
        ((Boolean) this.c.a.get()).booleanValue();
        if (this.e != 2) {
            return;
        }
        byte[] bArr = (byte[]) ((xsm) upqVar.b).c(b);
        if (bArr != null) {
            try {
                uqa uqaVar = (uqa) ((vtw) uqa.a.m().g(bArr, vtp.a())).r();
                if ((uqaVar.b & 1) != 0) {
                    this.f.a(this.d, tzs.e.i(uqaVar.c.w()));
                }
            } catch (vuq e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv f(upq upqVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv g(vvd vvdVar) {
        return utv.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        ImmutableList immutableList;
        usc uscVar = this.f;
        ImmutableList immutableList2 = uscVar.b;
        if (immutableList2 == null) {
            synchronized (uscVar.c) {
                if (uscVar.b == null) {
                    uscVar.b = ImmutableList.copyOf((Collection) uscVar.a);
                }
                immutableList = uscVar.b;
            }
            immutableList2 = immutableList;
        }
        this.d = immutableList2;
        this.e = 2;
        ((Boolean) this.c.a.get()).booleanValue();
        if (this.d.isEmpty() || this.e != 2) {
            return utv.a;
        }
        Object obj = vvdVar.b;
        xsj xsjVar = a;
        ImmutableList immutableList3 = this.d;
        vtw vtwVarM = upz.a.m();
        UnmodifiableIterator it = immutableList3.iterator();
        while (it.hasNext()) {
            vsz vszVarQ = vsz.q(tzs.e.j((String) it.next()));
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            upz upzVar = (upz) vtwVarM.b;
            vun vunVar = upzVar.b;
            if (!vunVar.c()) {
                upzVar.b = vuc.s(vunVar);
            }
            upzVar.b.add(vszVarQ);
        }
        ((xsm) obj).h(xsjVar, ((upz) vtwVarM.r()).h());
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ void d(upo upoVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void i(upo upoVar) {
    }
}
