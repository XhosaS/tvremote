package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjd extends pe {
    final /* synthetic */ CheckableImageButton a;

    public bjd(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.pe
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.pe
    public final void b(View view, sm smVar) {
        super.b(view, smVar);
        CheckableImageButton checkableImageButton = this.a;
        smVar.g(checkableImageButton.b);
        smVar.b.setChecked(checkableImageButton.a);
    }
}
