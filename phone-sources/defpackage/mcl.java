package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcl extends icu implements idw, iej {
    private final SharedPreferences g;
    private final ids h;
    private final String i = "watchnowtv_last_promo_dismissed_timestamp";
    private final iea j;

    public mcl(SharedPreferences sharedPreferences, iea ieaVar) {
        sharedPreferences.getClass();
        this.g = sharedPreferences;
        this.h = new ien(sharedPreferences, "watchnowtv_last_promo_dismissed_timestamp");
        this.j = ieaVar;
    }

    @Override // defpackage.idw
    public final /* synthetic */ boolean b(Object obj) {
        String strDX = ((kum) obj).dX();
        String str = strDX + krh.WELCOME_CARD_DISMISSED + ksn.c(((ldy) this.j).a());
        SharedPreferences sharedPreferences = this.g;
        return sharedPreferences.getBoolean(str, false) || sharedPreferences.getBoolean(String.valueOf(strDX).concat(krh.LEGACY_WELCOME_CARD_DISMISSED), false);
    }

    @Override // defpackage.iej
    public final void dM() {
        eb();
    }

    @Override // defpackage.icu
    public final void ec() {
        this.h.ea(this);
        this.j.ea(this);
    }

    @Override // defpackage.icu
    public final void ed() {
        this.h.ee(this);
        this.j.ee(this);
    }
}
