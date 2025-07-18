package defpackage;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vak extends afn {
    final /* synthetic */ NavigationMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vak(NavigationMenuItemView navigationMenuItemView) {
        super(afn.c);
        this.a = navigationMenuItemView;
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        ajrVar.a.setCheckable(this.a.c);
    }
}
