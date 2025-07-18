package defpackage;

import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kvv {
    public static final void c(ImmutableList immutableList, Parcel parcel) {
        ktw.h(parcel, ieg.f(new ArrayList(immutableList)));
    }

    protected abstract List a(Parcel parcel);

    public final ImmutableList b(Parcel parcel) {
        return ImmutableList.copyOf((Collection) a(parcel));
    }
}
