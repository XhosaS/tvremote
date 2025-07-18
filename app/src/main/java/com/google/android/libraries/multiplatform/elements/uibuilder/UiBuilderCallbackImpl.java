package com.google.android.libraries.multiplatform.elements.uibuilder;

import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.LocalElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UiBuilderCallbackImpl implements AutoCloseable {
    private void addChildView(ViewGroup viewGroup, NodeViewInterface nodeViewInterface) {
        throw null;
    }

    private void addPaintUnit(PaintUnitOwner paintUnitOwner, PaintUnit paintUnit) {
        throw null;
    }

    private boolean applyPaintTypeExtension(long j, long j2, int i, PaintUnit paintUnit, int i2, ElementsServices elementsServices) {
        throw null;
    }

    private boolean applyPaintUnitProperties(long j, long j2, long j3, long j4, int i, PaintUnit paintUnit) {
        throw null;
    }

    private boolean applyPaintUnitPropertiesWithExtensions(long j, long j2, long j3, long j4, int[] iArr, PaintUnit paintUnit) {
        throw null;
    }

    private boolean applyProperties(long j, long j2, long j3, NodeViewInterface nodeViewInterface, ElementsServices elementsServices, LocalElementsServices localElementsServices) {
        throw null;
    }

    private boolean applyPropertiesWithMultipleExtensions(long j, long j2, long j3, long j4, long j5, int[] iArr, NodeViewInterface nodeViewInterface, ElementsServices elementsServices, LocalElementsServices localElementsServices) {
        throw null;
    }

    private boolean applyPropertiesWithOneExtension(long j, long j2, long j3, long j4, long j5, int i, NodeViewInterface nodeViewInterface, ElementsServices elementsServices, LocalElementsServices localElementsServices) {
        throw null;
    }

    private boolean applyTypeExtension(long j, long j2, int i, NodeViewInterface nodeViewInterface, int i2, ElementsServices elementsServices) {
        throw null;
    }

    private PaintUnit createAndAddPaintUnit(long j, long j2, int i, float f, float f2, float f3, float f4, boolean z, int i2, PaintUnitOwner paintUnitOwner, ElementsServices elementsServices) {
        throw null;
    }

    private PaintUnit createPaintUnit(long j, long j2, int i, float f, float f2, float f3, float f4, boolean z, int i2, ElementsServices elementsServices) {
        throw null;
    }

    private NodeViewInterface createView(long j, long j2, int i, int i2, int i3, int i4, int i5, boolean z, int i6, ElementsServices elementsServices) {
        throw null;
    }

    private NodeViewInterface createViewWithTypeExtension(long j, long j2, int i, int i2, int i3, int i4, int i5, boolean z, int i6, ElementsServices elementsServices) {
        throw null;
    }

    private void insertChildView(ViewGroup viewGroup, NodeViewInterface nodeViewInterface, int i) {
        throw null;
    }

    private void insertPaintUnit(PaintUnitOwner paintUnitOwner, PaintUnit paintUnit, int i) {
        throw null;
    }

    private void invalidatePaintUnit(PaintUnitOwner paintUnitOwner, PaintUnit paintUnit) {
        throw null;
    }

    private void invalidateView(NodeViewInterface nodeViewInterface) {
        throw null;
    }

    private static native long jniCreateUiBuilderCallback(UiBuilderCallbackImpl uiBuilderCallbackImpl);

    private static native void jniDeleteUiBuilderCallback(long j);

    private static native int jniGetInstanceCount();

    private PaintUnit openPaintUnit(Object obj, int i) {
        throw null;
    }

    private NodeViewInterface openView(Object obj, int i) {
        throw null;
    }

    private void removeAllChildren(PaintUnitOwner paintUnitOwner, boolean z) {
        throw null;
    }

    private void removeChildView(ViewGroup viewGroup, NodeViewInterface nodeViewInterface) {
        throw null;
    }

    private void removeChildViewAt(ViewGroup viewGroup, int i) {
        throw null;
    }

    private void removePaintUnit(PaintUnitOwner paintUnitOwner, int i) {
        throw null;
    }

    private boolean updateBounds(NodeViewInterface nodeViewInterface, int i, int i2, int i3, int i4, boolean z) {
        throw null;
    }

    private boolean updatePaintUnitBounds(PaintUnit paintUnit, int i, int i2, int i3, int i4, boolean z) {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    private boolean applyPaintUnitProperties(long j, long j2, PaintUnit paintUnit) {
        throw null;
    }
}
