package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.elements.interfaces.IntersectionSubscription;
import com.google.android.libraries.elements.interfaces.OcclusionEdge;
import com.google.android.libraries.elements.interfaces.ProminenceAlgorithm;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$ProminenceAlgorithmContext;

/* compiled from: PG */
/* loaded from: classes.dex */
class mrs extends IntersectionEngine {
    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final IntersectionSubscription subscribe(String str, IntersectionObserver intersectionObserver) {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void checkProminence() {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setDefaultProminenceAlgorithm(ProminenceAlgorithm prominenceAlgorithm) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setIgnoreNonVisibleCells(boolean z) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setRtl(boolean z) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setEnableProminence(boolean z, ProminenceAlgorithm prominenceAlgorithm) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setEnableProminenceForGroup(String str, boolean z) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setOcclusionRect(Rect rect, String str) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setProminenceAlgorithmContext(ProminenceAlgorithm prominenceAlgorithm, IntersectionPropertiesOuterClass$ProminenceAlgorithmContext intersectionPropertiesOuterClass$ProminenceAlgorithmContext) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setProminenceAlgorithmForGroup(String str, ProminenceAlgorithm prominenceAlgorithm) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setAdditionalOcclusionEdge(OcclusionEdge occlusionEdge, int i, String str) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void setOcclusionEdge(OcclusionEdge occlusionEdge, int i, String str) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void onSizeChange(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
    public final void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i, int i2) {
    }
}
