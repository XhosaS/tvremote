package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hlz extends uua implements hhl, hhn {
    private final List c;
    private pan d;
    private pan e;
    private final String f;

    public hlz(Context context, xpy xpyVar) throws Resources.NotFoundException {
        super(new hhm());
        ((hhm) this.a).g = this;
        this.f = context.getPackageName();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.amati_pivot_item_image_constant_height);
        this.c = new ArrayList();
        for (int i = 0; i < xpyVar.b.size(); i++) {
            this.c.add(new hly(i, (xpk) xpyVar.b.get(i), this.f, dimensionPixelSize));
        }
    }

    @Override // defpackage.gkj
    public final int a() {
        return 13957;
    }

    @Override // defpackage.gkj
    public final pan b() {
        if (this.e == null) {
            this.e = new pan(145361);
        }
        return this.e;
    }

    @Override // defpackage.gkj
    public final pan c() {
        if (this.d == null) {
            this.d = new pan(13957);
        }
        return this.d;
    }

    @Override // defpackage.gkj
    public final String d() {
        return "";
    }

    @Override // defpackage.gkj
    public final String e() {
        return this.f;
    }

    @Override // defpackage.hhl
    public final int f() {
        return this.c.size();
    }

    @Override // defpackage.hhl
    public final /* bridge */ /* synthetic */ hkk g(int i) {
        return (hly) this.c.get(i);
    }

    @Override // defpackage.hhl
    public final /* synthetic */ String h() {
        return "";
    }

    @Override // defpackage.hhl
    public final /* synthetic */ String i() {
        return "";
    }

    @Override // defpackage.hhl
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.hhn
    public final double k() {
        return -1.0d;
    }
}
