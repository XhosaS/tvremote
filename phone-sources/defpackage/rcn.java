package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcn extends rbn {
    private Animatable a;
    private final yyh b;
    private final yyh c;

    public rcn(yyh yyhVar, yyh yyhVar2) {
        this.b = yyhVar;
        this.c = yyhVar2;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vps) obj2).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        vps vpsVar = (vps) obj2;
        vpsVar.getClass();
        ImageView imageView = (ImageView) ((cb) obj).a;
        Context context = imageView.getContext();
        context.getClass();
        Drawable drawableG = this.b.g(context, vpsVar);
        imageView.setImageDrawable(drawableG);
        vqe vqeVarC = vpsVar.c();
        imageView.setContentDescription(vqeVarC != null ? this.c.k(vqeVarC, context) : null);
        Animatable animatable = this.a;
        if (animatable != null) {
            animatable.stop();
        }
        this.a = null;
        if (vpsVar instanceof vqh) {
            if (!(drawableG instanceof Animatable)) {
                throw new IllegalStateException("ProgressOgImage should be used with an Animatable drawable.");
            }
            Animatable animatable2 = (Animatable) drawableG;
            this.a = animatable2;
            if (animatable2 != null) {
                animatable2.start();
            }
        }
    }
}
