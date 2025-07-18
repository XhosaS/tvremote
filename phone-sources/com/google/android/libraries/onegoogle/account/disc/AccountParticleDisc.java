package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.videos.R;
import defpackage.pqi;
import defpackage.qth;
import defpackage.qto;
import defpackage.qtq;
import defpackage.qtr;
import defpackage.qtz;
import defpackage.qua;
import defpackage.quc;
import defpackage.que;
import defpackage.quj;
import defpackage.quo;
import defpackage.qup;
import defpackage.quq;
import defpackage.qut;
import defpackage.rjg;
import defpackage.rrx;
import defpackage.sij;
import defpackage.sjl;
import defpackage.ssk;
import defpackage.trk;
import defpackage.tst;
import defpackage.unx;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountParticleDisc<AccountT> extends FrameLayout {
    public final AvatarView a;
    public final BadgeFrameLayout b;
    public final RingFrameLayout c;
    public final quq d;
    public quj e;
    public boolean f;
    public boolean g;
    public qtr h;
    public que i;
    public Object j;
    public qth k;
    public tst l;
    public final ssk m;
    public unx n;
    private final boolean o;
    private final CopyOnWriteArrayList p;
    private final quc q;
    private final boolean r;
    private final int s;
    private qut t;
    private rjg u;
    private tst v;

    public AccountParticleDisc(Context context) {
        this(context, null);
    }

    public static qtz r(unx unxVar) {
        Object obj;
        if (unxVar == null || (obj = unxVar.a) == null) {
            return null;
        }
        return (qtz) ((qua) obj).a.f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, que] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, que] */
    private final tst s() {
        sjl.c();
        if (!this.g) {
            return trk.a;
        }
        ssk sskVar = this.m;
        sjl.c();
        Object obj = sskVar.d;
        if (obj == null) {
            return trk.a;
        }
        ?? r2 = sskVar.c;
        if (r2 != 0) {
            tst tstVarF = ssk.f(r2.a(obj));
            if (tstVarF.g()) {
                return tstVarF;
            }
        }
        ?? r1 = sskVar.b;
        return r1 != 0 ? ssk.f(r1.a(sskVar.d)) : trk.a;
    }

    private final void t() {
        rjg rjgVar = this.u;
        if (rjgVar == null) {
            return;
        }
        quj qujVar = this.e;
        if (qujVar != null) {
            qujVar.c = rjgVar;
            if (qujVar.e != null) {
                BadgeFrameLayout badgeFrameLayout = qujVar.a;
                badgeFrameLayout.e(rjgVar);
                badgeFrameLayout.c(rjgVar, qujVar.e);
            }
        }
        qut qutVar = this.t;
        if (qutVar != null) {
            rjg rjgVar2 = this.u;
            qutVar.d = rjgVar2;
            if (qutVar.c != null) {
                RingFrameLayout ringFrameLayout = qutVar.b;
                ringFrameLayout.e(rjgVar2);
                ringFrameLayout.c(rjgVar2, qutVar.c);
            }
        }
    }

    private final void u(Object obj) {
        unx unxVar = this.n;
        if (unxVar != null) {
            unxVar.j(this.q);
        }
        que queVar = this.i;
        unx unxVarA = null;
        if (queVar != null && obj != null) {
            unxVarA = queVar.a(obj);
        }
        this.n = unxVarA;
        if (unxVarA != null) {
            unxVarA.i(this.q);
        }
    }

    public final int a() {
        return this.a.a;
    }

    public final String b() {
        if (this.l.g()) {
            return ((qup) this.l.c()).a;
        }
        return null;
    }

    public final void c(qtq qtqVar) {
        this.p.add(qtqVar);
    }

    public final void d(rjg rjgVar) {
        if (this.f || this.g) {
            this.u = rjgVar;
            t();
            if (this.f) {
                BadgeFrameLayout badgeFrameLayout = this.b;
                badgeFrameLayout.d();
                badgeFrameLayout.b(rjgVar);
            }
            if (this.g) {
                RingFrameLayout ringFrameLayout = this.c;
                ringFrameLayout.d();
                ringFrameLayout.b(rjgVar);
            }
        }
    }

    public final void e() {
        if (this.f) {
            return;
        }
        sij.x(!p(), "enableBadges is only allowed before calling initialize.");
        this.f = true;
    }

    public final void f(qtr qtrVar, qth qthVar) {
        qtrVar.getClass();
        this.h = qtrVar;
        this.k = qthVar;
        if (this.r && this.v.g()) {
            int iIntValue = this.s - ((Integer) this.v.c()).intValue();
            int paddingLeft = (iIntValue - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (iIntValue - getPaddingTop()) - getPaddingBottom();
            int iMax = Math.max(0, (int) Math.ceil(paddingLeft / 2.0f));
            int iMax2 = Math.max(0, (int) Math.ceil(paddingTop / 2.0f));
            setPadding(getPaddingLeft() + iMax, getPaddingTop() + iMax2, getPaddingRight() + iMax, getPaddingBottom() + iMax2);
        }
        if (this.f) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        rrx.ac(new qto(this, qthVar, 2, null));
        if (this.g) {
            this.t = new qut(this.a, this.c);
        }
        if (this.f) {
            this.e = new quj(this.b, this.a);
        }
        t();
    }

    public final void g() {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((qtq) it.next()).a();
        }
    }

    public final void h(qtq qtqVar) {
        this.p.remove(qtqVar);
    }

    public final void i(Object obj) {
        rrx.ac(new qto(this, obj, 3));
    }

    public final void j() {
        AvatarView avatarView = this.a;
        avatarView.i();
        avatarView.g(true);
    }

    public final void k(que queVar) {
        sij.x(this.f, "setDecorationRetriever is not allowed with false allowBadges.");
        this.i = queVar;
        u(this.j);
        if (this.g) {
            rrx.ac(new qto(this, queVar, 0));
        }
        m();
        g();
    }

    public final void l(int i) {
        int dimension;
        sij.x(!p(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.v = tst.i(Integer.valueOf(i));
        if (this.f || this.g || this.o) {
            dimension = (int) getResources().getDimension(((float) i) > getResources().getDimension(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring) ? R.dimen.og_apd_min_padding_large_ring : R.dimen.og_apd_min_padding);
        } else {
            dimension = 0;
        }
        AvatarView avatarView = this.a;
        ViewGroup.LayoutParams layoutParams = avatarView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        int i2 = i - (dimension + dimension);
        avatarView.e = true;
        avatarView.k(i2);
        avatarView.e(i2);
    }

    public final void m() {
        rrx.ac(new pqi(this, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, que] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, que] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, que] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, que] */
    public final void n(Object obj) {
        sjl.c();
        ssk sskVar = this.m;
        sskVar.e(sskVar.c, sskVar.d);
        sskVar.e(sskVar.b, sskVar.d);
        sskVar.d = obj;
        sskVar.d(sskVar.c, obj);
        sskVar.d(sskVar.b, obj);
        tst tstVarS = s();
        this.l = tstVarS;
        qut qutVar = this.t;
        if (qutVar != null) {
            qutVar.b(tstVarS);
        }
        u(obj);
        quj qujVar = this.e;
        if (qujVar != null) {
            qujVar.a(r(this.n), false);
        }
    }

    public final void o() {
        sjl.c();
        tst tstVarS = s();
        if (tstVarS.equals(this.l)) {
            return;
        }
        this.l = tstVarS;
        qut qutVar = this.t;
        if (qutVar != null) {
            sjl.c();
            qutVar.a(tstVarS, true);
        }
        g();
    }

    public final boolean p() {
        return this.h != null;
    }

    public final void q() {
        if (this.g) {
            return;
        }
        sij.x(!p(), "setAllowRings is only allowed before calling initialize.");
        this.g = true;
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new CopyOnWriteArrayList();
        final int i2 = 1;
        this.q = new quc(this) { // from class: qtp
            public final /* synthetic */ AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.quc
            public final void a() {
                if (i2 == 0) {
                    rrx.ac(new pqi(this.a, 11));
                    return;
                }
                AccountParticleDisc accountParticleDisc = this.a;
                accountParticleDisc.m();
                accountParticleDisc.g();
            }
        };
        final int i3 = 0;
        this.m = new ssk(new quc(this) { // from class: qtp
            public final /* synthetic */ AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.quc
            public final void a() {
                if (i3 == 0) {
                    rrx.ac(new pqi(this.a, 11));
                    return;
                }
                AccountParticleDisc accountParticleDisc = this.a;
                accountParticleDisc.m();
                accountParticleDisc.g();
            }
        });
        trk trkVar = trk.a;
        this.v = trkVar;
        this.l = trkVar;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, (ViewGroup) this, true);
        AvatarView avatarView = (AvatarView) findViewById(R.id.og_apd_internal_image_view);
        this.a = avatarView;
        this.b = (BadgeFrameLayout) findViewById(R.id.badge_wrapper);
        this.c = (RingFrameLayout) findViewById(R.id.ring_wrapper);
        this.d = new quq(getResources());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, quo.a, i, R.style.OneGoogle_AccountParticleDisc_DayNight);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
            dimensionPixelSize = dimensionPixelSize == Integer.MIN_VALUE ? typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Integer.MIN_VALUE) : dimensionPixelSize;
            this.o = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(3, false);
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            avatarView.h(typedArrayObtainStyledAttributes.getBoolean(6, true));
            typedArrayObtainStyledAttributes.recycle();
            j();
            if (dimensionPixelSize != Integer.MIN_VALUE) {
                l(dimensionPixelSize);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
