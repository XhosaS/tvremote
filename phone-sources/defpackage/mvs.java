package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvs extends View.BaseSavedState {
    public static final Parcelable.Creator<mvs> CREATOR = new mur(4);
    public final int a;
    public final boolean b;

    public mvs(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readByte() == 1;
    }

    public final String toString() {
        return String.format(Locale.US, "absoluteY: %d, lastSnapControlsWasDown: %s", Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public mvs(Parcelable parcelable, PlayHeaderListLayout playHeaderListLayout) {
        super(parcelable);
        this.a = playHeaderListLayout.c;
        this.b = playHeaderListLayout.d;
    }
}
