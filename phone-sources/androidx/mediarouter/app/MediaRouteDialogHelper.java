package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.videos.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class MediaRouteDialogHelper {
    private MediaRouteDialogHelper() {
    }

    public static int getDialogHeight(Context context) {
        return !context.getResources().getBoolean(R.bool.is_tablet) ? -1 : -2;
    }

    public static int getDialogWidth(Context context) throws Resources.NotFoundException {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i < i2 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        if (typedValue.type == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (typedValue.type != 6) {
                return -2;
            }
            fraction = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
        }
        return (int) fraction;
    }

    public static int getDialogWidthForDynamicGroup(Context context) {
        if (context.getResources().getBoolean(R.bool.is_tablet)) {
            return getDialogWidth(context);
        }
        return -1;
    }

    public static <E> HashMap<E, BitmapDrawable> getItemBitmapMap(Context context, ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, BitmapDrawable> map = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            E item = arrayAdapter.getItem(firstVisiblePosition + i);
            View childAt = listView.getChildAt(i);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt.getWidth(), childAt.getHeight(), Bitmap.Config.ARGB_8888);
            childAt.draw(new Canvas(bitmapCreateBitmap));
            map.put(item, new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
        }
        return map;
    }

    public static <E> HashMap<E, Rect> getItemBoundMap(ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, Rect> map = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            E item = arrayAdapter.getItem(firstVisiblePosition + i);
            View childAt = listView.getChildAt(i);
            map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
        }
        return map;
    }

    public static <E> Set<E> getItemsAdded(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list2);
        hashSet.removeAll(list);
        return hashSet;
    }

    public static <E> Set<E> getItemsRemoved(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }

    public static <E> boolean listUnorderedEquals(List<E> list, List<E> list2) {
        return new HashSet(list).equals(new HashSet(list2));
    }
}
