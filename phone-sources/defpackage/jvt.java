package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvt extends scf implements scl {
    public scg a;
    public sck b;
    public ser c;
    public kkv d;
    public sdw e;
    public kke f;
    private List g;
    private int h = 0;
    private final Set i = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.tag_filter_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.h;
    }

    @Override // defpackage.scl
    public final int c() {
        return -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jvt jvtVar = (jvt) scfVar;
        long j = true != yks.e(this.c, jvtVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jvtVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.g, jvtVar.g)) {
            j |= 4;
        }
        if (!yks.e(this.e, jvtVar.e)) {
            j |= 8;
        }
        return !yks.e(this.f, jvtVar.f) ? j | 16 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jvs();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.tagfilter.TagFilterViewBindable";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.scf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.sca r31, long r32) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvt.h(sca, long):void");
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.g, this.e, this.f);
    }

    @Override // defpackage.scf
    public final void i(View view) {
        scg scgVar = this.a;
        if (scgVar != null) {
            scgVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        sck sckVar = this.b;
        if (sckVar != null) {
            sckVar.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.h = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return true;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return true;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.i.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.i.remove(sddVar);
    }

    public final void r(List list) {
        if (yks.e(this.g, list)) {
            return;
        }
        this.g = list;
        G(2);
    }

    public final String toString() {
        return String.format("TagFilterViewModel{dataTree=%s, gtvDataTree=%s, selectedTags=%s, onTagsChanged=%s, onGtvTagsChanged=%s}", this.c, this.d, this.g, this.e, this.f);
    }
}
