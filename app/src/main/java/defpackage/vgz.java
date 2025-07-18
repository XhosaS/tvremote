package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.api.controller.AutoValue_ValidationResult;
import com.google.apps.tiktok.account.api.controller.ValidationResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vgz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<?> cls = getClass();
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        return new AutoValue_ValidationResult(i == 1, i2 == 1, (Intent) parcel.readParcelable(cls.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ValidationResult[i];
    }
}
