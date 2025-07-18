package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardFrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rci extends rbn {
    private final rct a;
    private final xbw b;
    private final vvd c;

    public rci(rct rctVar, xbw xbwVar, vvd vvdVar) {
        xbwVar.getClass();
        this.a = rctVar;
        this.b = xbwVar;
        this.c = vvdVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        vqs vqsVar = (vqs) obj2;
        vqsVar.getClass();
        this.c.i(((rcj) obj).a, vqsVar.e, vqsVar.c, vqsVar.f);
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        rcj rcjVar = (rcj) obj;
        vqs vqsVar = (vqs) obj2;
        vqsVar.getClass();
        yjk yjkVar = vqsVar.d;
        if (yjkVar != null) {
            yjkVar.a();
        }
        this.a.c(rcjVar.b, new rcw(vqsVar.g, vqsVar.c));
        rcjVar.c.setVisibility(0);
        rcjVar.d.setVisibility(8);
        CardFrameLayout cardFrameLayout = rcjVar.a;
        ColorDrawable colorDrawable = new ColorDrawable(((xzg) this.b.b()).c(vqsVar.b));
        Drawable drawable = cardFrameLayout.getContext().getDrawable(R.drawable.og_bento_ripple);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        drawableMutate.getClass();
        LayerDrawable layerDrawable = (LayerDrawable) drawableMutate;
        layerDrawable.setDrawableByLayerId(R.id.ripple_background_color, colorDrawable);
        cardFrameLayout.setBackground(layerDrawable);
    }
}
