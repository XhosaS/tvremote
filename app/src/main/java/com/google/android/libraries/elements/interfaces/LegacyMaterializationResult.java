package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LegacyMaterializationResult {
    final byte[] element;
    final int materializationNumber;

    public LegacyMaterializationResult(byte[] bArr, int i) {
        this.element = bArr;
        this.materializationNumber = i;
    }

    public byte[] getElement() {
        return this.element;
    }

    public int getMaterializationNumber() {
        return this.materializationNumber;
    }

    public String toString() {
        return "LegacyMaterializationResult{element=" + String.valueOf(this.element) + ",materializationNumber=" + this.materializationNumber + "}";
    }
}
