package wishList.service;

import games.game.vo.DiscountVO;
import games.game.vo.GameVO;
import wishList.vo.WishListVO;

import java.util.List;

public interface IWishListService {
	int insertWishList(WishListVO var1);

	int deleteWishList(String var1);

	String checkExist(String var1);

	GameVO gameDetail(String var1);

	String getWishId(WishListVO var1);

	DiscountVO discountInWish(String var1);

	List<WishListVO> getWishList(String var1);

	List<WishListVO> getMemberWishList(String var1);
}
