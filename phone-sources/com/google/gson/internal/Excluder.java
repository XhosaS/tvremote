package com.google.gson.internal;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Excluder implements Cloneable {
    static {
        new Excluder();
    }

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
