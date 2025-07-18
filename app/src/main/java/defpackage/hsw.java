package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, SuggestionChipItem.class.getClassLoader());
        return new SuggestionChipList(string, arrayList, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SuggestionChipList[i];
    }
}
