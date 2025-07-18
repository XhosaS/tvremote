package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dzw implements eaf {
    @Override // defpackage.eaf
    public final float a(Object obj) {
        int iHeight;
        if (obj instanceof View) {
            iHeight = ((View) obj).getHeight();
        } else {
            if (!(obj instanceof Drawable)) {
                throw new UnsupportedOperationException("Getting height from unsupported mount content: ".concat(obj.toString()));
            }
            iHeight = ((Drawable) obj).getBounds().height();
        }
        return iHeight;
    }

    @Override // defpackage.eaf
    public final String b() {
        return "height";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eaf
    public final void d(Object obj, float f) {
        if (!(obj instanceof elr)) {
            if (obj instanceof View) {
                View view = (View) obj;
                int top = view.getTop();
                enc.a(view.getLeft(), top, view.getRight(), (int) (top + f), view, false);
                return;
            } else {
                if (!(obj instanceof Drawable)) {
                    throw new UnsupportedOperationException("Setting height on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
                }
                Drawable drawable = (Drawable) obj;
                ena.b(drawable, drawable.getBounds().width(), (int) f);
                return;
            }
        }
        elr elrVar = (elr) obj;
        if (elrVar instanceof emx) {
            ((emx) elrVar).setAnimatedHeight((int) f);
        } else {
            int top2 = elrVar.getTop();
            enc.a(elrVar.getLeft(), top2, elrVar.getRight(), (int) (top2 + f), elrVar, false);
        }
        List listD = eae.d(elrVar);
        if (listD != null) {
            int i = (int) f;
            int width = elrVar.getWidth();
            for (int i2 = 0; i2 < listD.size(); i2++) {
                ena.b((Drawable) listD.get(i2), width, i);
            }
        }
    }

    @Override // defpackage.eaf
    public final float e(dvi dviVar) {
        return dviVar.b.height();
    }

    @Override // defpackage.eaf
    public final void c(Object obj) {
    }
}
