package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hec implements hdr {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataHelperImpl");
    public final iax b;
    public final fda c;
    public final gph d;
    public final fjr e;
    public final gtu f;
    public final agow g;
    public final icx h;
    public final idl i;
    private final Supplier j;
    private final ContentResolver k;
    private final ahbt l;
    private final ghr m;
    private hcp n;
    private final igs o;
    private int p;

    public hec(iax iaxVar, Supplier supplier, fda fdaVar, ContentResolver contentResolver, agte agteVar, ahbt ahbtVar, gph gphVar, fjr fjrVar, jcy jcyVar, gtu gtuVar, agow agowVar, icx icxVar, idl idlVar, igs igsVar, ghr ghrVar) {
        iaxVar.getClass();
        fdaVar.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        fjrVar.getClass();
        jcyVar.getClass();
        gtuVar.getClass();
        agowVar.getClass();
        idlVar.getClass();
        igsVar.getClass();
        ghrVar.getClass();
        this.b = iaxVar;
        this.j = supplier;
        this.c = fdaVar;
        this.k = contentResolver;
        this.l = ahbtVar;
        this.d = gphVar;
        this.e = fjrVar;
        this.f = gtuVar;
        this.g = agowVar;
        this.h = icxVar;
        this.i = idlVar;
        this.o = igsVar;
        this.m = ghrVar;
        this.p = 1;
    }

    @Override // defpackage.hdr
    public final Account a(String str) {
        Object next;
        Iterator it = this.f.n().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (agvy.c(((Account) next).name, str)) {
                break;
            }
        }
        return (Account) next;
    }

    @Override // defpackage.hdr
    public final hcp b() {
        return this.n;
    }

    @Override // defpackage.hdr
    public final void c() {
        this.n = null;
    }

    @Override // defpackage.hdr
    public final void d(Account account) {
        Account account2;
        if (this.n == null) {
            return;
        }
        yme ymeVar = yme.a;
        ymd ymdVar = new ymd();
        ymj.b(ymdVar);
        yme ymeVarA = ymj.a(ymdVar);
        hdu hduVar = new hdu(this, account);
        idl idlVar = this.i;
        if (idlVar.Y(account) || (((Boolean) this.g.a()).booleanValue() && idlVar.ab(account))) {
            account2 = account;
        } else {
            account2 = account;
            ahal.e(this.l, null, 0, new hdt(this, account2, ymeVarA, hduVar, null), 3);
        }
        f(account2);
    }

    @Override // defpackage.hdr
    public final void e() {
        hcp hcpVar = this.n;
        if (hcpVar != null) {
            yez yezVar = yez.a;
            yey yeyVar = new yey();
            int i = true != hcpVar.c ? 3 : 2;
            if ((yeyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yeyVar.y();
            }
            yez yezVar2 = (yez) yeyVar.b;
            yezVar2.d = i - 1;
            yezVar2.b |= 2;
            if ((yeyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yeyVar.y();
            }
            yez yezVar3 = (yez) yeyVar.b;
            yezVar3.c = 2;
            yezVar3.b = 1 | yezVar3.b;
            abxd abxdVarV = yeyVar.v();
            abxdVarV.getClass();
            List listSingletonList = Collections.singletonList((yez) abxdVarV);
            listSingletonList.getClass();
            this.m.X(this.p, listSingletonList);
        }
    }

    @Override // defpackage.hdr
    public final void f(Account account) {
        iax iaxVar = this.b;
        int iB = iaxVar.b(account);
        int iC = iaxVar.c(account);
        boolean z = iB == 1;
        boolean z2 = iC == 1;
        idl idlVar = this.i;
        this.n = new hcp(idlVar.ac(), idlVar.ae(account), z, z2);
        Uri.Builder builderBuildUpon = hef.a.buildUpon();
        String str = account != null ? account.name : null;
        ContentResolver contentResolver = this.k;
        if (str == null) {
            str = "";
        }
        contentResolver.notifyChange(builderBuildUpon.appendPath(str).build(), null);
    }

    @Override // defpackage.hdr
    public final void g(boolean z) {
        this.m.W(6, z ? 2 : 3);
        ahal.e(this.l, null, 0, new hdv(this, z, null), 3);
        if (z) {
            igs igsVar = this.o;
            Intent intentPutExtra = new Intent().putExtra("START_FARFIELD_MIC_EDUCATION_SCREEN", true);
            intentPutExtra.getClass();
            ComponentName componentName = irm.a;
            igsVar.a(intentPutExtra, irm.n);
        }
    }

    @Override // defpackage.hdr
    public final void h(boolean z, Optional optional, Account account) {
        idl idlVar = this.i;
        idlVar.C(account, z);
        agow agowVar = this.g;
        if (((Boolean) agowVar.a()).booleanValue() && optional.isPresent()) {
            idlVar.E(account, ((Boolean) optional.get()).booleanValue());
        } else {
            idlVar.E(account, false);
        }
        ghr ghrVar = this.m;
        ghrVar.S(z ? 2 : 3, this.p);
        if (((Boolean) agowVar.a()).booleanValue() && optional.isPresent()) {
            ghrVar.T(true != ((Boolean) optional.get()).booleanValue() ? 3 : 2);
        }
        hdy hdyVar = new hdy(this, account);
        if (account != null) {
            ahal.e(this.l, null, 0, new hdx(this, z, optional, account, hdyVar, null), 3);
        } else {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataHelperImpl", "updatePersonalResults", 268, "AssistantSliceDataHelperImpl.kt")).u("Cannot find user account to update personal results.");
        }
    }

    @Override // defpackage.hdr
    public final void i(boolean z) {
        this.i.H(z);
    }

    @Override // defpackage.hdr
    public final void j(boolean z, Account account) {
        this.m.W(5, z ? 2 : 3);
        heb hebVar = new heb(this, account, z);
        if (account != null) {
            ahal.e(this.l, null, 0, new hea(z, this, account, hebVar, null), 3);
        } else {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataHelperImpl", "updateVoiceInputEnabled", 335, "AssistantSliceDataHelperImpl.kt")).u("Cannot find user account to update assistant enabled settings.");
        }
    }

    @Override // defpackage.hdr
    public final boolean k() {
        return this.d == gph.a;
    }

    @Override // defpackage.hdr
    public final boolean l() {
        Account accountC = this.f.c();
        return (accountC == null || this.i.e(accountC) == idj.b) ? false : true;
    }

    @Override // defpackage.hdr
    public final boolean m(String str) {
        Account accountC = this.f.c();
        return agvy.c(accountC != null ? accountC.name : null, str);
    }

    @Override // defpackage.hdr
    public final boolean n(String str) {
        return m(str) && ((Boolean) this.j.get()).booleanValue();
    }

    @Override // defpackage.hdr
    public final void o(int i) {
        if (i == 0) {
            throw null;
        }
        this.p = i;
    }
}
