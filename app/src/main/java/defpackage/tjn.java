package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjn {
    public final void a(Status status, String str) {
        if (status.getCode().ordinal() != 0) {
            ((zdv) tjo.b.d().q("com/google/android/libraries/search/rendering/xuikit/elements/ResourceLoaderEmlParcelProcessor$Companion", "logStatus", 194, "ResourceLoaderEmlParcelProcessor.kt")).F("%s failed: %s", str, status);
        }
    }
}
