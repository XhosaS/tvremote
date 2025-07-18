package com.google.android.libraries.elements.interfaces;

import android.graphics.Rect;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class IntersectionObserver {
    public abstract Status criteriaMatched(ArrayList arrayList);

    public abstract ArrayList getCriteriaList();

    public abstract IntersectionPropertiesOuterClass$IntersectionObserverConfig getCustomConfig();

    public abstract String getGroupId();

    public abstract boolean needContinuousUpdate();

    public abstract Status visibilityChanged(float f, Rect rect, Rect rect2);
}
