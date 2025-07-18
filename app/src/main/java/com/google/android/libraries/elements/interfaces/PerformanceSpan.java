package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PerformanceSpan {
    final Long begin;
    final int beginThreadIdentifier;
    final Long end;
    final int endThreadIdentifier;
    final PerformanceEventInfo info;
    final boolean isMainThread;
    final int nonce;
    final Integer parentNonce;
    final PerformanceSpanType type;

    public PerformanceSpan(PerformanceSpanType performanceSpanType, int i, PerformanceEventInfo performanceEventInfo, Long l, Long l2, int i2, int i3, boolean z, Integer num) {
        this.type = performanceSpanType;
        this.nonce = i;
        this.info = performanceEventInfo;
        this.begin = l;
        this.end = l2;
        this.beginThreadIdentifier = i2;
        this.endThreadIdentifier = i3;
        this.isMainThread = z;
        this.parentNonce = num;
    }

    public Long getBegin() {
        return this.begin;
    }

    public int getBeginThreadIdentifier() {
        return this.beginThreadIdentifier;
    }

    public Long getEnd() {
        return this.end;
    }

    public int getEndThreadIdentifier() {
        return this.endThreadIdentifier;
    }

    public PerformanceEventInfo getInfo() {
        return this.info;
    }

    public boolean getIsMainThread() {
        return this.isMainThread;
    }

    public int getNonce() {
        return this.nonce;
    }

    public Integer getParentNonce() {
        return this.parentNonce;
    }

    public PerformanceSpanType getType() {
        return this.type;
    }

    public String toString() {
        PerformanceEventInfo performanceEventInfo = this.info;
        return "PerformanceSpan{type=" + String.valueOf(this.type) + ",nonce=" + this.nonce + ",info=" + String.valueOf(performanceEventInfo) + ",begin=" + this.begin + ",end=" + this.end + ",beginThreadIdentifier=" + this.beginThreadIdentifier + ",endThreadIdentifier=" + this.endThreadIdentifier + ",isMainThread=" + this.isMainThread + ",parentNonce=" + this.parentNonce + "}";
    }
}
