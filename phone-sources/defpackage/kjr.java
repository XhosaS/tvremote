package defpackage;

import com.google.android.apps.googletv.app.presentation.views.image.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjr extends ylp {
    final /* synthetic */ RoundedImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjr(Object obj, RoundedImageView roundedImageView) {
        super(obj);
        this.a = roundedImageView;
    }

    @Override // defpackage.ylp
    protected final void a(Object obj, Object obj2) {
        ((Number) obj2).floatValue();
        this.a.requestLayout();
    }

    @Override // defpackage.ylp
    protected final boolean b(Object obj, Object obj2) {
        return !yks.e(obj, obj2);
    }
}
