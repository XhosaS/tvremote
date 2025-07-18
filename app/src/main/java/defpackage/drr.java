package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drr extends afn {
    public final /* synthetic */ drs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drr(drs drsVar) {
        super(afn.c);
        this.a = drsVar;
    }

    @Override // defpackage.afn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super/*alk*/.c(view, ajrVar);
    }

    @Override // defpackage.afn
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final void e(View view, int i) {
        this.a.d.sendAccessibilityEvent(view, i);
    }

    @Override // defpackage.afn
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.d.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean i(View view, int i, Bundle bundle) {
        return super/*alk*/.i(view, i, bundle);
    }
}
