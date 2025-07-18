package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ey implements Parcelable {
    public static final Parcelable.Creator<ey> CREATOR = new av(12);
    public final int a;
    final long b;
    final long c;
    final float d;
    public final long e;
    final int f;
    final CharSequence g;
    final long h;
    final List i;
    final long j;
    final Bundle k;
    public PlaybackState l;

    public ey(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = i2;
        this.g = charSequence;
        this.h = j4;
        this.i = new ArrayList(list);
        this.j = j5;
        this.k = bundle;
    }

    public static ey a(Object obj) {
        ArrayList arrayList;
        ex exVar;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    PlaybackState.CustomAction customAction2 = customAction;
                    Bundle extras = customAction2.getExtras();
                    eu.c(extras);
                    exVar = new ex(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), extras);
                    exVar.e = customAction2;
                } else {
                    exVar = null;
                }
                arrayList2.add(exVar);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle extras2 = playbackState.getExtras();
        eu.c(extras2);
        ey eyVar = new ey(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2);
        eyVar.l = playbackState;
        return eyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.a + ", position=" + this.b + ", buffered position=" + this.c + ", speed=" + this.d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }

    public ey(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(ex.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(eu.class.getClassLoader());
        this.f = parcel.readInt();
    }
}
